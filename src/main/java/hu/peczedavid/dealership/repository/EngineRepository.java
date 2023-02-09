package hu.peczedavid.dealership.repository;

import hu.peczedavid.dealership.entity.EngineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngineRepository extends JpaRepository<EngineEntity, Long> {
}
