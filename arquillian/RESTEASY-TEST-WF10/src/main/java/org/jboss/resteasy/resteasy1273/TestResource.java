package org.jboss.resteasy.resteasy1273;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/test")
public interface TestResource {
    @GET
    @Produces("text/plain")
    public String get();

    @GET
    @Path("error")
    @Produces("text/plain")
    String error();

    @POST
    @Path("data")
    @Produces("text/plain")
    @Consumes("text/plain")
    public String getData(String data);
}
