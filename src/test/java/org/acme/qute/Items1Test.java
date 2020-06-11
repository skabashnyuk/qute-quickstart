package org.acme.qute;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.junit.jupiter.api.Test;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import java.util.stream.Collectors;

@QuarkusTestResource(DatabaseResource.class)
@QuarkusTest
public class Items1Test {
    @Inject
    Instance<Item> allInstances;

    @Test

    public void testEndpoint() {
        allInstances.stream().collect(Collectors.toList()).parallelStream().forEach(Item::sayHello);
    }

}
