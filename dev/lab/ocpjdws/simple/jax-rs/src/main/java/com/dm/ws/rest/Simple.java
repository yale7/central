/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package com.dm.ws.rest;

import java.util.Date;
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
@Path("simple")
public class Simple {

    @Context
    private UriInfo context;

    /** Creates a new instance of Simple */
    public Simple() {
    }

    /**
     * Retrieves representation of an instance of com.dm.ws.rest2.Simple
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    public String getText() {
        return "Hello World. Today is: " + new Date();
    }

    /**
     * PUT method for updating or creating an instance of Simple
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/plain")
    public void putText(String content) {
        System.out.println("Simple.putText(" + content + ")");
    }
}
