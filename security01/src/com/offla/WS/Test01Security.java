package com.offla.WS;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/Test01Security")
public class Test01Security {
	
	@Path("/sayhi")
	@GET
	public String sayHi(){
		return "This is a message to test security";
	}

}
