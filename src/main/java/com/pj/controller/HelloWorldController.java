package com.pj.controller;

import java.text.MessageFormat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pj.service.HelloWorldService;

@Path("/hello")
@Component
public class HelloWorldController {

	@Autowired private HelloWorldService helloWorldService;
	
	@GET
	@Path("/{param}")
	public Response getMessage(@PathParam("param") String name) {
		String message = MessageFormat.format(helloWorldService.getGreeting(), name);
		return Response.status(Status.OK).entity(message).build();
	}
	
}