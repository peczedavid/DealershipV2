package hu.peczedavid.dealership.repositories;

import hu.peczedavid.dealership.entities.ModelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<ModelEntity, Long> {
}
