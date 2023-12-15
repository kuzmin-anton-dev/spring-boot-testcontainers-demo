package com.kuzminanton.spring.boot.testcontainers.demo.bean_configuration;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;

@TestConfiguration
public class BeanTestContainersTestConfiguration {

    @Bean
    static PostgreSQLContainer container1() {
        return new PostgreSQLContainer<>("postgres:16");
    }

    @Bean
    static PostgreSQLContainer container2() {
        return new PostgreSQLContainer<>("postgres:16");
    }

    @Bean
    static PostgreSQLContainer container3() {
        return new PostgreSQLContainer<>("postgres:16");
    }
}
