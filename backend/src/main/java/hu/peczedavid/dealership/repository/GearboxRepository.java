package hu.peczedavid.dealership.repository;

import hu.peczedavid.dealership.entity.gearbox.GearboxEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GearboxRepository extends JpaRepository<GearboxEntity, Long> {
}
