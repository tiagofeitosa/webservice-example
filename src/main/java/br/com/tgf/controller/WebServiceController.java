package br.com.tgf.controller;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.tgf.util.PropertiesReader;

@Path("/")
public class WebServiceController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String version() throws IOException {
		PropertiesReader reader = new PropertiesReader("properties-from-pom.properties");
		
		StringBuilder sb = new StringBuilder();
		sb.append("Version: ");
		sb.append(reader.getProperty("project-version"));
		
		return sb.toString();
	}
}
