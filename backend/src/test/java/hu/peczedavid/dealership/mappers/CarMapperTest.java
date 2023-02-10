package hu.peczedavid.dealership.mappers;

import hu.peczedavid.dealership.dto.CarDto;
import hu.peczedavid.dealership.entities.*;
import hu.peczedavid.dealership.entities.fuel.FuelEntity;
import hu.peczedavid.dealership.entities.fuel.FuelType;
import hu.peczedavid.dealership.entities.gearbox.GearboxEntity;
import hu.peczedavid.dealership.entities.gearbox.GearboxType;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(JUnit4.class)
public class CarMapperTest {
    private final CarMapper carMapper = Mappers.getMapper(CarMapper.class);

    private static CarEntity carEntity;
    private static List<CarEntity> carEntityList;

    @BeforeClass
    public static void setUpEntities() {
        // Set up engine
        FuelEntity fuel = new FuelEntity();
        fuel.setId(1L);
        fuel.setType(FuelType.PETROL);

        PowerEntity power = new PowerEntity();
        power.setId(1L);
        power.setPowerHP(150);
        power.setPowerKW(110);

        GearboxEntity gearbox = new GearboxEntity();
        gearbox.setId(1L);
        gearbox.setGears(5);
        gearbox.setType(GearboxType.MANUAL);

        EngineEntity engine = new EngineEntity();
        engine.setId(1L);
        engine.setFuel(fuel);
        engine.setGearbox(gearbox);
        engine.setPower(power);

        // Set up brand and model
        BrandEntity brand = new BrandEntity();
        brand.setId(1L);
        brand.setName("Audi");

        ModelEntity modelEntity = new ModelEntity();
        modelEntity.setId(1L);
        modelEntity.setName("A3");
        modelEntity.setBrand(brand);

        carEntity = new CarEntity();
        carEntity.setId(1L);
        carEntity.setEngine(engine);
        carEntity.setBrand(brand);
        carEntity.setModel(modelEntity);
        carEntity.setMass(1275);
        carEntity.setMileage(240_000);
        carEntity.setFuelTankSize(55);
        carEntity.setPrice(1_590_000);
        carEntity.setTrunkSize(350);
        carEntity.setYear(2004);

        carEntityList = new ArrayList<>();
        carEntityList.add(carEntity);
    }

    @Test
    public void testCarEntityToCarDto() {
        CarDto carDto = carMapper.toCarDto(carEntity);

        assertEquals(carDto.getId(), carEntity.getId());
        assertNotNull(carDto.getModel());
        assertEquals(carDto.getModel().getId(), carEntity.getModel().getId());
        assertEquals(carDto.getModel().getName(), carEntity.getModel().getName());
    }

    @Test
    public void testCarEntityListToCarDtoList() {
        List<CarDto> carDtoList = carMapper.toCarDtoList(carEntityList);

        assertEquals(carDtoList.size(), 1);
        CarDto carDto = carDtoList.get(0);

        assertEquals(carDto.getId(), carEntity.getId());
        assertNotNull(carDto.getModel());
        assertEquals(carDto.getModel().getId(), carEntity.getModel().getId());
        assertEquals(carDto.getModel().getName(), carEntity.getModel().getName());
    }
}
