/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.thogakade.controller.custom.impl;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import lk.ijse.thogakade.controller.ServerConnectorFactory;
import lk.ijse.thogakade.controller.custom.PlaceOrderController;
import lk.ijse.thogakade.dto.CustomerDTO;
import lk.ijse.thogakade.dto.OrderDTO;
import lk.ijse.thogakade.observers.Observer;
import lk.ijse.thogakade.service.ServiceFactory;
import lk.ijse.thogakade.service.custom.CustomerService;
import lk.ijse.thogakade.service.custom.OrderDetailService;
import lk.ijse.thogakade.service.custom.OrderService;

/**
 *
 * @author student
 */
public class PlaceOrderControllerImpl extends UnicastRemoteObject implements PlaceOrderController{
    private OrderService orderService;
    private CustomerService customerService;
    private OrderDetailService orderDetailService;
    public PlaceOrderControllerImpl()throws RemoteException, NotBoundException, MalformedURLException{
    orderService = (OrderService) ServerConnectorFactory.getInstance().getService(ServiceFactory.ServiceTypes.ORDER);
    customerService = (CustomerService) ServerConnectorFactory.getInstance().getService(ServiceFactory.ServiceTypes.CUSTOMER);
    orderDetailService = (OrderDetailService) ServerConnectorFactory.getInstance().getService(ServiceFactory.ServiceTypes.ORDER_DETAIL);
    }
    @Override
    public boolean add(OrderDTO order) throws Exception {
        boolean result = orderService.add(order);
        return result;
    }

    @Override
    public boolean update(OrderDTO order) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(OrderDTO order) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OrderDTO get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<OrderDTO> getAll() throws Exception {
        System.out.println("place order get all");
       return orderService.getAll();
    }

    @Override
    public void registorObserver(Observer observer) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unRegistorObserver(Observer observer) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean reserve(String id) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean release(String id) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    

