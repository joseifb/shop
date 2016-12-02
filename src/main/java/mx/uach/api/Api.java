/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.api;

import mx.uach.service.WpWoocommerceOrderItemsServiceImp;
import mx.uach.shop.entities.WpWoocommerceOrderItems;
import static spark.Spark.get;

/**
 * Esta clase contiene la instancia de las rutas del API REST.
 * @author: Jose Ignacio Flores
 */
public class Api {

    public static void main(String[] args) {
        WpWoocommerceOrderItemsServiceImp service = new WpWoocommerceOrderItemsServiceImp();

        get("/hello", (req, res) -> "Hola esta es la apy de kopay shop");
        get("/buscarpedido/:id", (req, res) -> {
            String id = req.params(":id");
            WpWoocommerceOrderItems p = service.consultarPedido(id);
            if (p != null) {
                
                return p.toString();
            }
            res.status(400);
           // return new ResponseError("No user with id '%s' found", id);
           return "No user with id "+id+" found";
        });
        get("/listapedido", (req, res) -> service.getAll());
        //get("/listapedido", (req, res) -> service.getAll(), json());

    }
//    post("/nuevopedido", (req, res) -> service.agregarPedido(p)
//    req.queryParams("name"),
//    req.queryParams("email")
//    ), json());
}


