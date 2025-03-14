package org.jdvpl.PersonInfo;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.Set;

@ApplicationScoped
public class ExtensionInfo {

    @Inject
    @RestClient
    PersonRestClient personRestClient;

    public Set<PersonRestClient.Extension> getExtensions(){
        Set<PersonRestClient.Extension> restclientExtension=personRestClient.getExtensionsById("io.quarkus:quarkus-hibernate-validator");
        restclientExtension.forEach(extension -> {
            System.out.println("Extension Id:"+extension.id);
            System.out.println("Extension Name"+extension.name);
        });
        return restclientExtension;
    }
}

