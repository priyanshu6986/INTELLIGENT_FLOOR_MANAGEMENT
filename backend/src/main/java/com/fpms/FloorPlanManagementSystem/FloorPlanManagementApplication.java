package com.fpms.FloorPlanManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.fpms.FloorPlanManagementSystem.model")

public class FloorPlanManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(FloorPlanManagementApplication.class, args);
    }
}

