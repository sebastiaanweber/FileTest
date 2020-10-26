package com.example.demo.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@TestConfiguration
@ComponentScan(basePackages = {"com.example.demo"})
@PropertySource(value = "classpath:application-test.properties")
public class TestConfig {

}