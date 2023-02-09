package hu.peczedavid.dealership.repository;

import hu.peczedavid.dealership.entity.PowerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PowerRepository extends JpaRepository<PowerEntity, Long> {
}
