package hu.peczedavid.dealership.dto;

import hu.peczedavid.dealership.entity.BrandEntity;
import hu.peczedavid.dealership.entity.CarEntity;
import hu.peczedavid.dealership.entity.EngineEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

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

    // TODO: make into mapper
    public static CarDto fromCarEntity(CarEntity carEntity) {
        CarDto carDto = new CarDto();

        carDto.setId(carEntity.getId());
        carDto.setBrand(carEntity.getBrand());
        carDto.setModel(ModelDto.fromModelEntity(carEntity.getModel()));
        carDto.setEngine(carEntity.getEngine());
        carDto.setYear(carEntity.getYear());
        carDto.setMass(carEntity.getMass());
        carDto.setFuelTankSize(carEntity.getFuelTankSize());
        carDto.setMileage(carEntity.getMileage());
        carDto.setTrunkSize(carEntity.getTrunkSize());
        carDto.setPrice(carEntity.getPrice());

        return carDto;
    }

    // TODO: make into mapper
    public static List<CarDto> fromCarEntityList(List<CarEntity> carEntityList) {
        List<CarDto> carDtoList = new ArrayList<>();

        for(CarEntity carEntity : carEntityList)
            carDtoList.add(CarDto.fromCarEntity(carEntity));

        return carDtoList;
    }
}
