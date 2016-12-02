/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.service;

import java.util.List;
import mx.uach.session.HibernateSession;
import mx.uach.shop.entities.WpWoocommerceOrderItems;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Esta clase contiene la implementacion de la interface servicio.
 * @author: Jose Ignacio Flores
 */
public class WpWoocommerceOrderItemsServiceImp implements WpWoocommerceOrderItemsService{

    @Override
    public List<WpWoocommerceOrderItems> getAll() {
        SessionFactory sf = HibernateSession.getSessionFactory();
        Session s = sf.openSession();
        List<WpWoocommerceOrderItems> pedido = s.createQuery("from WpWoocommerceOrderItems").list();
        s.close();
        sf.close();
        return pedido;
    }

    @Override
    public WpWoocommerceOrderItems consultarPedido(String id) {
        Integer Id = Integer.parseInt(id);
        SessionFactory sf = HibernateSession.getSessionFactory();
        Session session = sf.openSession();
        WpWoocommerceOrderItems p = (WpWoocommerceOrderItems)session.get(WpWoocommerceOrderItems.class, Id);
        if (p!=null) {
//             return "El pedido de codigo de pedido "+p.getOrderId()+" cuyo nombre es "+p.getOrderItemName();
            return p;  
            
        }
        else{
//            return "El producto de codigo "+id+" no existe";
              return null;
        }
    }

    @Override
    public Integer agregarPedido(WpWoocommerceOrderItems p) {
        SessionFactory sf = HibernateSession.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        Integer success = (Integer)session.save(p);
        t.commit();
        session.close();
        sf.close();
        return success;
        
    }
    
    
    
    
 
}
