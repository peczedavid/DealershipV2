package hu.peczedavid.dealership.entities;

import hu.peczedavid.dealership.entities.fuel.FuelEntity;
import hu.peczedavid.dealership.entities.gearbox.GearboxEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "engines")
@Data
@NoArgsConstructor
public class EngineEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "fuel_id", nullable = false, referencedColumnName = "id")
    private FuelEntity fuel;

    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "gearbox_id", nullable = false, referencedColumnName = "id")
    private GearboxEntity gearbox;

    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name = "power_id", nullable = false, referencedColumnName = "id")
    private PowerEntity power;

}
