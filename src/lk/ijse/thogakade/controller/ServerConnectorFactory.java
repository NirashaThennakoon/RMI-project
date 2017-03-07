/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.thogakade.controller;

import com.mysql.jdbc.util.ServerController;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import lk.ijse.thogakade.service.ServiceFactory;
import lk.ijse.thogakade.service.SuperService;
import lk.ijse.thogakade.service.custom.CustomerService;
import lk.ijse.thogakade.service.custom.ItemService;
import lk.ijse.thogakade.service.custom.OrderDetailService;
import lk.ijse.thogakade.service.custom.OrderService;

/**
 *
 * @author Pramod Dilshan
 */
public class ServerConnectorFactory {
    private static ServerConnectorFactory serverConnector;
    private static ServiceFactory serviceFactory;
    private static CustomerService customerService;
    private static ItemService itemService;
    private static OrderService orderService;
    private static OrderDetailService orderDetailService;
            
    

    private  ServerConnectorFactory() throws NotBoundException, MalformedURLException, RemoteException {
        serviceFactory = (ServiceFactory) Naming.lookup("rmi://localhost:5050/ThogakadeServer");
        customerService = (CustomerService) serviceFactory.getService(ServiceFactory.ServiceTypes.CUSTOMER);
        itemService = (ItemService) serviceFactory.getService(ServiceFactory.ServiceTypes.ITEM);
        orderService = (OrderService) serviceFactory.getService(ServiceFactory.ServiceTypes.ORDER);
        orderDetailService=  (OrderDetailService) serviceFactory.getService(ServiceFactory.ServiceTypes.ORDER_DETAIL);
    }
    
    public static ServerConnectorFactory getInstance() throws NotBoundException, MalformedURLException, RemoteException{
        if (serverConnector==null) {
            serverConnector = new ServerConnectorFactory();
        }
        return serverConnector;
    
    }
    
    public SuperService getService(ServiceFactory.ServiceTypes serviceType){
        switch(serviceType){
            case CUSTOMER:
                return customerService;
            case ORDER:
                return orderService;
            case ITEM:
                return itemService;
            case ORDER_DETAIL:
                return orderDetailService;
            default:
                return null;
        }
    }
    
   
}
