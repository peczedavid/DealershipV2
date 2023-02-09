package hu.peczedavid.dealership.repository;

import hu.peczedavid.dealership.entity.ModelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<ModelEntity, Long> {
}
