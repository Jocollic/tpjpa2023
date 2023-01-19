package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.Parameter;
import jpa.classMetier.User;

@Path("/pet")
@Produces({"application/json", "application/xml"})
public class UserResource {

  @GET
  @Path("/{userId}")
  public User getUserById(@PathParam("id") Long userId)  {
      // return user
      return new User();
  }

  @POST
  @Consumes("application/json")
  public Response addUser(
      @Parameter(description = "User object that needs to be added to the store", required = true) User user) {
    // add user
    return Response.ok().entity("SUCCESS").build();
  }
}