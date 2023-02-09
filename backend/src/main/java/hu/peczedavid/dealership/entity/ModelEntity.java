package hu.peczedavid.dealership.entity;

import hu.peczedavid.dealership.entity.gearbox.GearboxEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "models")
@Data
@NoArgsConstructor
public class ModelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "brand_id", nullable = false, referencedColumnName = "id")
    private BrandEntity brand;

    private String name;

}
