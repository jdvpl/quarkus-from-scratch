package org.jdvpl.PersonInfo.controllers;

import jakarta.inject.Inject;
import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jdvpl.PersonInfo.ExtensionInfo;

import java.util.Set;
import java.util.stream.Collectors;

@Path("/extension")
public class PersonInfoController {
    @Inject
    ExtensionInfo extensionInfo;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Set<JsonObject> getExtensions(){
        Set<JsonObject> collect=extensionInfo.getExtensions().stream().map(extension -> {
            JsonObject json= Json.createObjectBuilder()
                    .add("id",extension.id)
                    .add("name",extension.name)
                    .add("shoartName",extension.shortName)
                    .add("keywords",Json.createArrayBuilder(extension.keywords))
                    .build();
            return  json;
        }).collect(Collectors.toSet());
        return  collect;
    }
}
