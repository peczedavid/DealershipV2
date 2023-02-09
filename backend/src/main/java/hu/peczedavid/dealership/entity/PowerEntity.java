package hu.peczedavid.dealership.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "powers")
@Data
@NoArgsConstructor
public class PowerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "power_kw")
    private int powerKW;

    @Column(name = "power_hp")
    private int powerHP;

}
