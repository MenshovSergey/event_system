package ru.sergej.application;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("ru.sergej")
@EnableScheduling
public class AppConfig {
}
