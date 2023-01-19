package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.Parameter;
import jpa.Dao.UserDao;
import jpa.classMetier.User;

@Path("/user")
@Produces({"application/json"})
public class UserRessource {
  UserDao dao = new UserDao();

  @GET
  @Path("/{id}")
  public User getUserById(@PathParam("id") Long userId)  {
      // return user
      return dao.findOne(userId);
  }

  @POST
  @Consumes("application/json")
  public Response addUser(
      @Parameter(description = "User object that needs to be added to the store", required = true) User user) {
    // add user
    return Response.ok().entity("SUCCESS").build();
  }
}