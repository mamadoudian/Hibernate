package com.jersey.rest;

import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;



import com.jersey.repository.EmployeeRepository;

import io.swagger.annotations.Api;

@Path("/employee")
@Api(value="/employee", description = "Developper resource")

public class EmployeeeRessource {
	
	private EmployeeRepository employeeRepo = new EmployeeRepository();
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public List getEmployees( ){
		return this.employeeRepo.listEmployees();
	}
}
