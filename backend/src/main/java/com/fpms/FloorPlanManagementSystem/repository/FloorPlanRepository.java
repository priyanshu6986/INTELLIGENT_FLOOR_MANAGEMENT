package com.fpms.FloorPlanManagementSystem.repository;

import com.fpms.FloorPlanManagementSystem.model.FloorPlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FloorPlanRepository extends JpaRepository<FloorPlanEntity, Long> {
    Optional<FloorPlanEntity> findByVersion(String version);
}
