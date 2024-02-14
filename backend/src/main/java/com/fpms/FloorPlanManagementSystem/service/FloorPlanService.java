package com.fpms.FloorPlanManagementSystem.service;

import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.List;
import java.util.Optional;

import com.fpms.FloorPlanManagementSystem.repository.FloorPlanRepository;
import com.fpms.FloorPlanManagementSystem.model.FloorPlanEntity;
import com.fpms.FloorPlanManagementSystem.model.FloorDTO;

@Service
public class FloorPlanService {

    private final FloorPlanRepository floorPlanRepository;
    private final ObjectMapper objectMapper; // Jackson ObjectMapper for JSON processing

    public FloorPlanService(FloorPlanRepository floorPlanRepository, ObjectMapper objectMapper) {
        this.floorPlanRepository = floorPlanRepository;
        this.objectMapper = objectMapper;
    }

    public void updateFloorPlan(String username, String version, List<FloorDTO> updatedFloorDTOs) {
        FloorPlanEntity floorPlanEntity = new FloorPlanEntity();
        floorPlanEntity.setUsername(username);
        floorPlanEntity.setVersion(version);
        floorPlanEntity.setFloorPlanData(mapToJSON(updatedFloorDTOs));

        floorPlanRepository.save(floorPlanEntity);
    }

    public List<FloorDTO> getFloorPlans(String username, String version) {
        Optional<FloorPlanEntity> floorPlanEntityOptional =
                floorPlanRepository.findByVersion(version);

        return floorPlanEntityOptional.map(entity -> mapToDTO(entity.getFloorPlanData()))
                .orElse(null);
    }

    private String mapToJSON(List<FloorDTO> floorDTOs) {
        try {
            return objectMapper.writeValueAsString(floorDTOs);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to serialize floor plan data to JSON", e);
        }
    }

    private List<FloorDTO> mapToDTO(String json) {
        try {
            return objectMapper.readValue(json, objectMapper.getTypeFactory().constructCollectionType(List.class, FloorDTO.class));
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to deserialize floor plan data from JSON", e);
        }
    }
}

