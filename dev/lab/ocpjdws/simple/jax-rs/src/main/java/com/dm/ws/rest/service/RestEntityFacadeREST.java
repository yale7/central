package com.dm.ws.rest.service;

import com.dm.ws.rest.model.RestEntity;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Daniel Mroczka daniel.mroczka@gmail.com Created: 2011-10-08 00:35:23
 *
 */
@Stateless
@Path("restentity")
public class RestEntityFacadeREST extends AbstractFacade<RestEntity> {

    @PersistenceContext
    private EntityManager em;

    public RestEntityFacadeREST() {
        super(RestEntity.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(RestEntity entity) {
        super.create(entity);
    }

    @GET
    //@POST
    @Path("createDate")
    @Produces(MediaType.TEXT_HTML)
    public String createFoo() {
        RestEntity entity = new RestEntity();
        entity.setName((new Date()).toString());
        super.create(entity);
        return "ID: " + String.valueOf(entity.getId());
    }
    
    @GET
    @Path("create")
    @Produces(MediaType.TEXT_PLAIN)
    public String createNameGet(@NotNull @QueryParam("param1") String value) {
        RestEntity entity = new RestEntity(value);
        super.create(entity);
        return "ID: " + String.valueOf(entity.getId());
    } 
    
    @POST
    @Path("create")
    @Produces(MediaType.TEXT_HTML)
    public String createNamePost(@NotNull @FormParam("param1") String value) {
        RestEntity entity = new RestEntity(value);
        super.create(entity);
        return "ID: " + String.valueOf(entity.getId());
    }     

    @PUT
    @Override
    @Consumes({"application/xml", "application/json"})
    public void edit(RestEntity entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public RestEntity find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<RestEntity> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<RestEntity> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @java.lang.Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
