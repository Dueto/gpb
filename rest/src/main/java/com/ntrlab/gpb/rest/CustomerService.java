package com.ntrlab.gpb.rest;

import com.ntrlab.gpb.common.Customer;
import com.ntrlab.gpb.common.api.responses.GetEntityListResponse;
import com.ntrlab.gpb.common.api.responses.IResponse;
import com.ntrlab.gpb.dao.RestManager;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by PRIMA on 14.07.2016.
 */
@Path("/customers")
@Produces({"application/json"})
public class CustomerService {

    @EJB
    private RestManager restManager;

    @GET
    @Path("/")
    public Response getAccountList() {
        List<Customer> customers = restManager.getCustomerList();
        IResponse response = new GetEntityListResponse<Customer>(customers);
        return Response.status(response.getHttpResponseStatus()).entity(response.getJSONString()).build();
    }
}
