package ru.smirnova.spring.kursovaya;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@ComponentScan("ru.smirnova.spring.kursovaya")
@EnableJpaRepositories("ru.smirnova.spring.kursovaya")
public class HibernateConfig {
}