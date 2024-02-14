package com.fpms.FloorPlanManagementSystem.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fpms.FloorPlanManagementSystem.controller.FloorPlanController;
import com.fpms.FloorPlanManagementSystem.repository.FloorPlanRepository;
import com.fpms.FloorPlanManagementSystem.service.FloorPlanService;

@Configuration
@ComponentScan("com.fpms.FloorPlanManagementSystem.*")
@EntityScan("com.fpms.FloorPlanManagementSystem.*")
@EnableJpaRepositories("com.fpms.FloorPlanManagementSystem.*")
public class AppConfig {

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public FloorPlanService floorPlanService(FloorPlanRepository floorPlanRepository, ObjectMapper objectMapper) {
        return new FloorPlanService(floorPlanRepository, objectMapper);
    }

    @Bean
    public FloorPlanController floorPlanController(FloorPlanService floorPlanService) {
        return new FloorPlanController(floorPlanService);
    }
}
