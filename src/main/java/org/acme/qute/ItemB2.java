package org.acme.qute;

import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ItemB2 implements Item {
    private static final Logger LOG = Logger.getLogger(ItemB2.class);

    @Inject
    org.acme.qute.Config config;

    @Override
    public void sayHello() {
        LOG.info("Hello from " + this.getClass().getName() + config.getConfig());
    }
}
