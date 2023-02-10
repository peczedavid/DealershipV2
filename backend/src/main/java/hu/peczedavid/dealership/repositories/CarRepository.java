package hu.peczedavid.dealership.repositories;

import hu.peczedavid.dealership.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarEntity, Long> {
}
