package com.dm.ws.rest.client;
//import com.sun.grizzly.http.SelectorThread;
import com.sun.grizzly.http.SelectorThread;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.container.grizzly.GrizzlyServerFactory;
import java.io.IOException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author Daniel Mroczka daniel.mroczka@gmail.com Created: 2011-10-08 22:49:53
 *
 */
public class Main {

    @Path("resource")
    public static class MyResource {

        @GET
        @Produces("text/plain")
        public String get() {
            return "Hello from Grizzly";
        }
    }

    public static void main(String[] args) throws IOException {
        SelectorThread st =
                GrizzlyServerFactory.create("http://localhost:9999");
        try {
            Client c = Client.create();
            WebResource r = c.resource("http://localhost:9999/simple");
            String s = r.get(String.class);
            System.out.println(s);
        } finally {
            st.stopEndpoint();
        }
    }
}