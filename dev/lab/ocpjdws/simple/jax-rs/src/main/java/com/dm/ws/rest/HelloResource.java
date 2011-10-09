/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package com.dm.ws.rest;

import com.dm.ws.rest.model.Customer;
import java.io.StringWriter;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * REST Web Service
 *
 * @author daniel
 */
@Path("hello")
public class HelloResource {

    @Context
    private UriInfo context;

    /** Creates a new instance of HelloResource */
    public HelloResource() {
    }

    /**
     * Retrieves representation of an instance of com.dm.ws.rest2.HelloResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/xml")
    public String getXml(@QueryParam("name") String name) throws JAXBException {

        Customer customer = new Customer(name);
        StringWriter writer = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(Customer.class);
        Marshaller m = context.createMarshaller();
        m.marshal(customer, writer);
        System.out.println(writer.toString());
        //TODO return proper representation object
        return writer.toString();
    }

    @GET
    @Produces("application/xml")
    @Path("hello2")
    public String getXml2() {
        //TODO return proper representation object
        return "<customer>\n"
                + "<id>345</id>\n"
                + "<firstName>Joseph</firstName>\n"
                + "<middleName>William</middleName>\n"
                + "<lastName>Graystone</lastName>\n"
                + "</customer>\n";
    }

    /**
     * PUT method for updating or creating an instance of HelloResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
