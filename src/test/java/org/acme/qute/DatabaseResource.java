package org.acme.qute;


import com.google.common.collect.ImmutableMap;
import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.shaded.org.apache.commons.lang.RandomStringUtils;

import java.util.Map;

public class DatabaseResource implements QuarkusTestResourceLifecycleManager {

    public static final String DB_NAME = RandomStringUtils.random(10, true, true);
    public static final String DB_USERNAME_NAME = RandomStringUtils.random(10, true, true);
    public static final String DB_PASSWORD = RandomStringUtils.random(10, true, true);

    public static final PostgreSQLContainer DATABASE =
            new PostgreSQLContainer<>("postgres:11-alpine")
                    .withDatabaseName(DB_NAME)
                    .withUsername(DB_USERNAME_NAME)
                    .withPassword(DB_PASSWORD)
                    .withExposedPorts(5432);

    @Override
    public Map<String, String> start() {
        DATABASE.start();
        return ImmutableMap.of(
                "quarkus.datasource.url",
                DATABASE.getJdbcUrl(),
                "quarkus.datasource.username",
                DB_USERNAME_NAME,
                "quarkus.datasource.password",
                DB_PASSWORD);
    }

    @Override
    public void stop() {
        DATABASE.stop();
    }
}