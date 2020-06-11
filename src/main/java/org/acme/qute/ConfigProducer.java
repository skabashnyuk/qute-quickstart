package org.acme.qute;

import org.eclipse.microprofile.config.Config;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

public class ConfigProducer {

    private final Config config;

    @Inject
    public ConfigProducer(Config config) {
        this.config = config;
    }

    @Produces
    public org.acme.qute.Config produce() {
        config.getPropertyNames().forEach(System.out::println);
        return new org.acme.qute.Config();
    }
}
