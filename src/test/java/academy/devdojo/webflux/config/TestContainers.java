package academy.devdojo.webflux.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;

@Log4j2
public class TestContainers {
    protected static final PostgreSQLContainer<?> POSTGRES_SQL_CONTAINER = new PostgreSQLContainer<>("postgres:latest");

    static {
        POSTGRES_SQL_CONTAINER.start();
    }

    @DynamicPropertySource
    static void setPostgresProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.r2dbc.username", POSTGRES_SQL_CONTAINER::getUsername);
        registry.add("spring.r2dbc.password", POSTGRES_SQL_CONTAINER::getPassword);
    }
}
