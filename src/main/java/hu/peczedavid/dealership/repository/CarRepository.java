package hu.peczedavid.dealership.repository;

import hu.peczedavid.dealership.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarEntity, Long> {
}
