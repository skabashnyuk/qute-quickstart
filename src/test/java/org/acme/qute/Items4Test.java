package org.acme.qute;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import java.util.stream.Collectors;

@QuarkusTest
public class Items4Test {
    @Inject
    Instance<Item> allInstances;

    @Test
    public void testEndpoint3() {
        allInstances.stream().collect(Collectors.toList()).parallelStream().forEach(Item::sayHello);
    }

}
