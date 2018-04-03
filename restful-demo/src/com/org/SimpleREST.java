package com.org;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/simple")
public class SimpleREST {
@Path("/content")
@GET
@Produces(MediaType.TEXT_PLAIN)
	public Response getSomeContent1()
	{Response response=null;
	
response=Response.status(200).entity("Hello RESTful").build();

	
	return response;
	}
@Path("/content")
@GET
@Produces(MediaType.APPLICATION_XML)
public Response getSomeContent2()
{Response response=null;
Customer customer=new Customer(111,"Rahul",35);

response=Response.status(200).entity(customer).build();
return response;
}
	
	}

