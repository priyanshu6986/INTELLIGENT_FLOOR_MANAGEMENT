package com.fpms.FloorPlanManagementSystem.model;

public class RoomDTO {
    private String name;
    private int capacity;

    // Constructors, getters, and setters

    public RoomDTO() {
    }

    public RoomDTO(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
