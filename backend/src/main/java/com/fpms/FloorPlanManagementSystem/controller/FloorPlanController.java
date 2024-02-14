package com.fpms.FloorPlanManagementSystem.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.fpms.FloorPlanManagementSystem.service.FloorPlanService;
import com.fpms.FloorPlanManagementSystem.model.FloorDTO;
import com.fpms.FloorPlanManagementSystem.model.UpdateRequestDTO;

@RestController
@RequestMapping("/api/floor-plan")
public class FloorPlanController {

    private final FloorPlanService floorPlanService;

    public FloorPlanController(FloorPlanService floorPlanService) {
        this.floorPlanService = floorPlanService;
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateFloorPlan(@RequestBody UpdateRequestDTO updateRequestDTO) {
        if(updateRequestDTO.getUsername().equals("admin")) {
            floorPlanService.updateFloorPlan(updateRequestDTO.getUsername(), updateRequestDTO.getVersion(), updateRequestDTO.getFloorDTOs());
            return ResponseEntity.ok("Floor plan updated successfully");
        }
        else{
            return ResponseEntity.ok("Only admin user can update the floor plan");
        }
    }

    @GetMapping
    public ResponseEntity<List<FloorDTO>> getFloorPlans(
            @RequestParam String username,
            @RequestParam String version) {
        List<FloorDTO> floorDTOs = floorPlanService.getFloorPlans(username, version);
        return ResponseEntity.ok(floorDTOs);
    }
}

