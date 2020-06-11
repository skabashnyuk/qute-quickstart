package org.acme.qute;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;

@QuarkusTest
public class ItemsTest {
    @Inject
    Instance<Item> allInstances;

    @Test
    public void testEndpoint1() {
        allInstances.stream().forEach(Item::sayHello);
    }

}
