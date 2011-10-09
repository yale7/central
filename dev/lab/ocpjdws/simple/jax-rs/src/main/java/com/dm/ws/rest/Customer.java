/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package com.dm.ws.rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author daniel
 */
@Path("customer")
public class Customer {

    @Context
    private UriInfo context;

    /** Creates a new instance of Customer */
    public Customer() {
    }

    /**
     * Retrieves representation of an instance of com.dm.ws.rest2.Customer
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Path("{name}")
    public String getCustomerByName(@PathParam("name") String name) {
        return name;
    }
    
    @GET @Produces("text/plain") @Path("{firstname}-{lastname}")
    public String getCustomerByFirstLastName(@PathParam("firstname") String firstname, @PathParam("lastname") String lastname) {
        return firstname + "::" + lastname;
    }

    /*@GET
    @Produces("plain/text")
    @Path("{a@b}")
    public String getCustomerByEmail(@PathParam("name") String name) {
        return name;
    }*/
    /**
     * PUT method for updating or creating an instance of Customer
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
