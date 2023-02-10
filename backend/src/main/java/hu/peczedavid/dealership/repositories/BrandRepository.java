package hu.peczedavid.dealership.repositories;

import hu.peczedavid.dealership.entities.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<BrandEntity, Long> {
}
