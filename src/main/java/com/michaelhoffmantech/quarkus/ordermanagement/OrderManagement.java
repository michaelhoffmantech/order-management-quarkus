package com.michaelhoffmantech.quarkus.ordermanagement;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/orders")
public class OrderManagement {

    @ConfigProperty(name = "message.orderProcessed")
    String orderProcessedMessage;

    @GET
    @Path("/{orderId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Order getOrder(@PathParam("orderId") Integer orderId) {
        return new Order(orderId, orderProcessedMessage);
    }
}