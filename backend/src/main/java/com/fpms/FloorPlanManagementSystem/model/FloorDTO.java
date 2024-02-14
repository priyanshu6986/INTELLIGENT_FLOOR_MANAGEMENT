package com.fpms.FloorPlanManagementSystem.model;

import java.util.List;

public class FloorDTO {
    private int floorNumber;
    private List<RoomDTO> rooms;

    // Constructors, getters, and setters

    public FloorDTO() {
    }

    public FloorDTO(int floorNumber, List<RoomDTO> rooms) {
        this.floorNumber = floorNumber;
        this.rooms = rooms;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<RoomDTO> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomDTO> rooms) {
        this.rooms = rooms;
    }
}
