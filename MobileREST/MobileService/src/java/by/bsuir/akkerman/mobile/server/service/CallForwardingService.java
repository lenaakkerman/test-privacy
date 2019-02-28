/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.akkerman.mobile.server.service;

import by.bsuir.akkerman.mobile.server.dao.DaoUniversal;
import by.bsuir.akkerman.mobile.server.entity.CallForwarding;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.GenericEntity;

/**
 * REST Web Service
 *
 * @author Lena
 */
@Path("entity.callforwarding")
public class CallForwardingService {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CallForwardingService
     */
    public CallForwardingService() {
    }

    /**
     * Retrieves representation of an instance of by.bsuir.akkerman.mobile.server.service.CallForwardingService
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of CallForwardingService
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
    
    @GET
    @Path("/all")
    @Produces("application/json")
    public List<CallForwarding> getListCallForwardings() {
        DaoUniversal dao = new DaoUniversal();
        List<CallForwarding> callFs = new ArrayList<>(); 
        CallForwarding obj = new CallForwarding();
        callFs = new ArrayList(dao.read(obj));       
        return callFs;                
    }

}
