package bgd.edu.ua.controllers;

import bgd.edu.ua.dto.UsersDto;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/resources")
public class TestController {
    @Produces(MediaType.APPLICATION_JSON)
    public String checkGet() {
        return "you called get method";
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHello(@PathParam("id") Long id) {
        return Response.ok().entity("you sent " + id).build();
    }


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response checkPost(@QueryParam("user") String userName){
        return Response.ok().entity("Hello " + userName).build();
    }

    @POST
    @Path("/checkJsonBody")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response checkPost(UsersDto user){
        return Response.ok().entity("Hello " + user.toString()).build();
    }
}
