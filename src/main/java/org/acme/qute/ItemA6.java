package org.acme.qute;

import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ItemA6 implements Item {
    private static final Logger LOG = Logger.getLogger(ItemA6.class);

    @Inject
    org.acme.qute.Config config;

    @Override
    public void sayHello() {
        LOG.info("Hello from " + this.getClass().getName() + config.getConfig());
    }
}
