/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.thogakade.controller.custom.impl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import lk.ijse.thogakade.controller.ServerConnectorFactory;
import lk.ijse.thogakade.controller.custom.CustomerController;
import lk.ijse.thogakade.dto.CustomerDTO;
import lk.ijse.thogakade.dto.OrderDTO;
import lk.ijse.thogakade.dto.OrderDetailDTO;
import lk.ijse.thogakade.observers.Observer;
import lk.ijse.thogakade.service.ServiceFactory;
import lk.ijse.thogakade.service.custom.CustomerService;

/**
 *
 * @author student
 */
public class CustomerControllerImpl extends UnicastRemoteObject implements CustomerController {

    private CustomerService customerService;
   

    public CustomerControllerImpl() throws NotBoundException, MalformedURLException, RemoteException {
        customerService = (CustomerService) ServerConnectorFactory.getInstance().getService(ServiceFactory.ServiceTypes.CUSTOMER);
        System.out.println("grt server");
    }

    @Override
    public boolean add(CustomerDTO t) throws Exception {
        boolean result = customerService.add(t);
        return result;
    }

    @Override
    public boolean update(CustomerDTO t) throws Exception {
        boolean result = customerService.update(t);
        return result;
    }

    @Override
    public boolean delete(CustomerDTO t) throws Exception {
        boolean result = customerService.delete(t);
        return result;
    }

    @Override
    public CustomerDTO get(String id) throws Exception {
        
          CustomerDTO customer1 = customerService.get(id);
        return  customer1;
    }

    
    @Override
    public ArrayList<CustomerDTO> getAll() throws Exception {

    System.out.println("controller");
       ArrayList<CustomerDTO> allCustomers=customerService.getAll();
       return allCustomers;    }

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
        return customerService.reserve(id, customerService);
    }

    @Override
    public boolean release(String id) throws RemoteException {
        return customerService.release(id);
                }
    

    

}
