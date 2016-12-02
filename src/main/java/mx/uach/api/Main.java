/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.api;

import java.util.List;
import mx.uach.service.WpWoocommerceOrderItemsServiceImp;
import mx.uach.shop.entities.WpWoocommerceOrderItems;

/**
 *
 * @author Jose Ignacio Flores
 */
public class Main {
    
    public static void main(String[] args) {
        
        WpWoocommerceOrderItemsServiceImp service = new WpWoocommerceOrderItemsServiceImp();
         
//        List<WpWoocommerceOrderItems> serviceList = service.getAll();
//        for (WpWoocommerceOrderItems pedido : serviceList) {
//            System.out.println(pedido.getOrderId());
//        }
//        //System.out.println();
//          System.out.println(service.consultarPedido(1));
          
    }
    
}
