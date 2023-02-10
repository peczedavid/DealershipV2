package hu.peczedavid.dealership.dto;

import hu.peczedavid.dealership.entities.BrandEntity;
import hu.peczedavid.dealership.entities.EngineEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CarDto {

    private Long id;

    private BrandEntity brand;

    private ModelDto model;

    private EngineEntity engine;

    private int year;

    private int mass;

    private int fuelTankSize;

    private int mileage;

    private int trunkSize;

    private int price;

}
