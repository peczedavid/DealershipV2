package hu.peczedavid.dealership.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "cars")
@Data
@NoArgsConstructor
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "brand_id", nullable = false, referencedColumnName = "id")
    private BrandEntity brand;

    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "model_id", nullable = false, referencedColumnName = "id")
    private ModelEntity model;

    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "engine_id", nullable = false, referencedColumnName = "id")
    private EngineEntity engine;

    private int year;

    private int mass;

    @Column(name = "fuel_tank_size")
    private int fuelTankSize;

    private int mileage;

    @Column(name = "trunk_size")
    private int trunkSize;

    private int price;
}
