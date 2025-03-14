package org.jdvpl;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/jdvplquarkus")
public class ExampleResource {
    @ConfigProperty(name = "greeting")
    private String gretting;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("jiren")
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("jiren/{name}")
    public String customHello(@PathParam("name") String name){
        return this.gretting +name + " eres un kisama insectivoro";
    }
}
