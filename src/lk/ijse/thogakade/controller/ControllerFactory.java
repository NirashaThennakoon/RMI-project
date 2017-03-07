/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.thogakade.controller;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import lk.ijse.thogakade.controller.custom.impl.CustomerControllerImpl;
import lk.ijse.thogakade.controller.custom.impl.ItemControllerImpl;
import lk.ijse.thogakade.controller.custom.impl.OrderDetailControllerImpl;
import lk.ijse.thogakade.controller.custom.impl.PlaceOrderControllerImpl;

/**
 *
 * @author student
 */
public class ControllerFactory {
    
    public enum ControllerTypes{
        CUSTOMER,PLACE_ORDER,ITEM,ORDER_DETAIL;
    }
    
    private static ControllerFactory controllerFactory;
    
    private ControllerFactory(){
        
    }
    
    public static ControllerFactory getInstance(){
        if (controllerFactory == null){
            controllerFactory = new ControllerFactory();
        }
        return controllerFactory;
    }
    
    public SuperController getController(ControllerTypes controllerType) throws NotBoundException, MalformedURLException, RemoteException{
        switch(controllerType){
            case CUSTOMER:
                return new CustomerControllerImpl();
            case PLACE_ORDER:
                return new PlaceOrderControllerImpl();
            case ITEM:
                return new ItemControllerImpl();
            case ORDER_DETAIL:
                return new OrderDetailControllerImpl();
                
            default:
                return null;
        }
    }
    
}
