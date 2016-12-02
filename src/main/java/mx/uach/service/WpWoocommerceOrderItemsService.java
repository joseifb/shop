/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.service;

import java.util.List;
import mx.uach.shop.entities.WpWoocommerceOrderItems;

/*/**
 * Esta clase contiene la interface la cual hace las operaciones del Api
 * @author: Jose Ignacio Flores
 */
public interface WpWoocommerceOrderItemsService {
    
    /**
     * 
     * @return Regresa todo lo que tiene pedidos.
     */
    public List<WpWoocommerceOrderItems> getAll();
    
    public WpWoocommerceOrderItems consultarPedido(String id);
    public Integer agregarPedido(WpWoocommerceOrderItems p);
    
    
    

    
}
