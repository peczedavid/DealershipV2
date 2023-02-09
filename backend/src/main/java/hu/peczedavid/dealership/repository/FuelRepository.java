package hu.peczedavid.dealership.repository;

import hu.peczedavid.dealership.entity.fuel.FuelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuelRepository extends JpaRepository<FuelEntity, Long> {
}
