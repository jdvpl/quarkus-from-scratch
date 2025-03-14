package org.jdvpl.LifeCycleBean;

import io.quarkus.runtime.Shutdown;
import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

import java.util.logging.Logger;

@ApplicationScoped
public class AppLifeCycleBean {

    private static  final Logger LOGGER=Logger.getLogger("listenerBean");

    void onStart(@Observes StartupEvent event){
        LOGGER.info("This application is Starting ....");
    }

    void onStop(@Observes ShutdownEvent event){
        LOGGER.info("This application is dowm ....");
    }
}
