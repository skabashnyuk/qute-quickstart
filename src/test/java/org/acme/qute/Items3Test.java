package org.acme.qute;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;

@QuarkusTest
public class Items3Test {
    @Inject
    Instance<Item> allInstances;

    @Test
    public void testEndpoint2() {
        allInstances.stream().forEach(Item::sayHello);
    }

}
