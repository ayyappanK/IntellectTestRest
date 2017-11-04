
package IntellectTest.RestApplication.service;
	import java.util.List;
	
	import javax.ws.rs.DELETE;
	import javax.ws.rs.GET;
	import javax.ws.rs.POST;
	import javax.ws.rs.PUT;
	import javax.ws.rs.Path;
	import javax.ws.rs.PathParam;
	import javax.ws.rs.Produces;
	import javax.ws.rs.core.MediaType;
	
	import IntellectTest.RestApplication.dao.UserProfileDAO;
	import IntellectTest.RestApplication.model.UserProfile;
	@Path("/UserProfiles")
	public class UserProfileService {
	
	// URI:
// /contextPath/servletPath/UserProfiles
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<UserProfile> getUserProfiles_JSON() {
	List<UserProfile> listOfCountries = UserProfileDAO.getAllUserProfiles();
	return listOfCountries;
	    }
	 
	    // URI:
	    // /contextPath/servletPath/UserProfiles/{empNo}
	    @GET
	    @Path("/{empNo}")
	   @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public UserProfile getUserProfile(@PathParam("empNo") String empNo) {
	        return UserProfileDAO.getUserProfile(empNo);
	    }
	 
	    // URI:
	    // /contextPath/servletPath/UserProfiles
	    @POST
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public UserProfile addUserProfile(UserProfile emp) {
	        return UserProfileDAO.addUserProfile(emp);
	    }
	 
	    // URI:
	    // /contextPath/servletPath/UserProfiles
	    @PUT
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public UserProfile updateUserProfile(UserProfile emp) {
	        return UserProfileDAO.updateUserProfile(emp);
	    }
	 
	    @DELETE
	    @Path("/{empNo}")
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public void deleteUserProfile(@PathParam("empNo") String empNo) {
	        UserProfileDAO.deleteUserProfile(empNo);
	    }
	 
	}
}
