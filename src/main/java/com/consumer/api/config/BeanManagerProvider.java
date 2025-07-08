package com.consumer.api.config;


import jakarta.enterprise.inject.spi.BeanManager;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class BeanManagerProvider {

    @Produces
    public BeanManager produceBeanManager() {
        return CDI.current().getBeanManager();
    }
}
