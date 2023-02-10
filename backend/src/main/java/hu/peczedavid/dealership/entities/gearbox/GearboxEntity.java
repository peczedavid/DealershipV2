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
    @Column(unique = true, nullable = false)
    private GearboxType type;

    @Column(unique = true, nullable = false)
    private int gears;
}
