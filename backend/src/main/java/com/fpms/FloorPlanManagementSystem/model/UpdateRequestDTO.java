package com.fpms.FloorPlanManagementSystem.model;

import java.util.List;

public class UpdateRequestDTO {

    private String username;
    private String version;
    private List<FloorDTO> floorDTOs;

    // Constructors, getters, and setters

    public UpdateRequestDTO() {
    }

    public UpdateRequestDTO(String username, String version, List<FloorDTO> floorDTOs) {
        this.username = username;
        this.version = version;
        this.floorDTOs = floorDTOs;
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

    public List<FloorDTO> getFloorDTOs() {
        return floorDTOs;
    }

    public void setFloorDTOs(List<FloorDTO> floorDTOs) {
        this.floorDTOs = floorDTOs;
    }
}

