package com.jersey.rest;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

@Path("/api")
public class SwaggerRessource {
	private static final Logger logger = Logger.getLogger(SwaggerRessource.class.getName());
	
	
    @GET
    @Produces
    public byte[] Get1() {
        try {
            byte[] bites = Files.readAllBytes(FileSystems.getDefault().getPath("/WEB-INF/swagger/dist/index.html"));
            return bites;
        } catch (IOException e) {
        	e.printStackTrace();
            return null;
        }
    }

    @GET
    @Produces
    @Path("{path:.*}")
    public byte[] Get(@PathParam("path") String path) {
        try {
            return Files.readAllBytes(FileSystems.getDefault().getPath("/WEB-INF/swagger/dist/"+path));
        } catch (IOException e) {
            return null;
        }
    }
}
