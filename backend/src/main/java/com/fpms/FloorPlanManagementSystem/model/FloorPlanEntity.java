package com.fpms.FloorPlanManagementSystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "floor_plan")
public class FloorPlanEntity {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Id
    @Column(nullable = false)
    private String version;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String floorPlanData;

    public FloorPlanEntity() {
    }

    // Constructor with parameters
    public FloorPlanEntity(String username, String version, String floorPlanData) {
        this.username = username;
        this.version = version;
        this.floorPlanData = floorPlanData;
    }
    
    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getFloorPlanData() {
        return floorPlanData;
    }

    public void setFloorPlanData(String floorPlanData) {
        this.floorPlanData = floorPlanData;
    }
}

