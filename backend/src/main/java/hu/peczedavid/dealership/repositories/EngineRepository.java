package hu.peczedavid.dealership.repositories;

import hu.peczedavid.dealership.entities.EngineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngineRepository extends JpaRepository<EngineEntity, Long> {
}
