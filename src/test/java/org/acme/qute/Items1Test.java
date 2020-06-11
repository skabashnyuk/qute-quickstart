package org.acme.qute;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;

@QuarkusTest
public class Items1Test {
    @Inject
    Instance<Item> allInstances;
    @Inject
    org.acme.qute.ItemC itemC;
    @Inject
    org.acme.qute.ItemA6  ItemA6;
    @Inject
    org.acme.qute.ItemB2 ItemB2;
    @Inject
    org.acme.qute.ItemB3 ItemB3;
    @Inject
    org.acme.qute.ItemC7 ItemC7;
    @Inject
    org.acme.qute.ItemA ItemA;
    @Inject
    org.acme.qute.ItemC2 ItemC2;
    @Inject
    org.acme.qute.ItemC3 ItemC3;
    @Inject
    org.acme.qute.ItemA4 ItemA4;
    @Inject
    org.acme.qute.ItemB1 ItemB1;
    @Inject
    org.acme.qute.ItemA2 ItemA2;
    @Inject
    org.acme.qute.ItemC1 ItemC1;
    @Inject
    org.acme.qute.ItemC5 ItemC5;
    @Inject
    org.acme.qute.ItemA1 ItemA1;
    @Inject
    org.acme.qute.ItemA3 ItemA3;
    @Inject
    org.acme.qute.ItemC4 ItemC4;
    @Inject
    org.acme.qute.ItemC6 ItemC6;
    @Inject
    org.acme.qute.ItemC8 ItemC8;
    @Inject
    org.acme.qute.ItemB ItemB;
    @Inject
    org.acme.qute.ItemB6 ItemB6;
    @Inject
    org.acme.qute.ItemB4 ItemB4;
    @Inject
    org.acme.qute.ItemB5 ItemB5;
    @Inject
    org.acme.qute.ItemA5 ItemA5;

    @Test

    public void testEndpoint() {
        allInstances.stream().forEach(Item::sayHello);
    }

}
