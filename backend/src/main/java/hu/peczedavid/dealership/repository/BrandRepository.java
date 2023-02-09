package hu.peczedavid.dealership.repository;

import hu.peczedavid.dealership.entity.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<BrandEntity, Long> {
}
