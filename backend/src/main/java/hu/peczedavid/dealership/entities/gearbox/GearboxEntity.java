package hu.peczedavid.dealership.entities.gearbox;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "gearboxes")
@Data
@NoArgsConstructor
public class GearboxEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private GearboxType type;

    private int gears;
}
