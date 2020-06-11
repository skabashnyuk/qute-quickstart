package org.acme.qute;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ItemC8 implements Item {
    @Inject
    org.acme.qute.Config config;

    @Override
    public void sayHello() {
        System.out.println("Hello from " + this.getClass().getName() + config.getConfig());
    }
}
