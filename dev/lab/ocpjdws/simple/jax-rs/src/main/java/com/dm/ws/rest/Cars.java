package com.dm.ws.rest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author Daniel Mroczka daniel.mroczka@gmail.com Created: 2011-10-08 21:12:09
 *
 */
@Path("cars")
public class Cars {

    /*
     * http://localhost:8080/jax-rs/rest/cars
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String defaultMethod() {
        return "default method";
    }

    /**
     * http://localhost:8080/jax-rs/rest/cars/vw/param1=val1;type=e55;color=123/1984
     */
    @GET
    @Path("{make}/{model}/{year}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getModel(@PathParam("make") String make, @PathParam("model") PathSegment car, @PathParam("year") String year) {
        String res = make + "\n";
        for (String key : car.getMatrixParameters().keySet()) {
            res += "key=" + key + " value=" + car.getMatrixParameters().getFirst(key) + "\n";
        }

        return res + "\n" + year;
    }

    /*
     * http://localhost:8080/jax-rs/rest/cars/encoded?encoded=ala%20ma&nonencoded=ala%20ma
     */
    @GET
    @Path("encoded")
    @Produces(MediaType.TEXT_PLAIN)
    public String encoded(@Encoded @QueryParam("encoded") String encoded, @QueryParam("nonencoded") String nonencoded) {
        return " [" + encoded + "::" + nonencoded + "]";
    }

    /*
     * http://localhost:8080/jax-rs/rest/cars/jaxb
     */
    @GET
    @Path("jaxb")
    @Produces(MediaType.APPLICATION_XML)
    public com.dm.ws.rest.model.Customer getCustomerJaxb() {
        return new com.dm.ws.rest.model.Customer();
    }

    /*
     * http://localhost:8080/jax-rs/rest/cars/jaxb
     */
    @GET
    @Path("nonjaxb")
    @Produces(MediaType.APPLICATION_XML)
    public com.dm.ws.rest.model.NonJaxb getCustomerNonJaxb() {
        return new com.dm.ws.rest.model.NonJaxb();
    }
}
