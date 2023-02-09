package hu.peczedavid.dealership.controller;

import hu.peczedavid.dealership.entity.*;
import hu.peczedavid.dealership.entity.fuel.FuelEntity;
import hu.peczedavid.dealership.entity.gearbox.GearboxEntity;
import hu.peczedavid.dealership.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DebugController {

    @Autowired
    private EngineRepository engineRepository;

    @Autowired
    private CarRepository carRepository;

    @PostMapping(path = "/debug")
    public ResponseEntity<String> debugFunction() {
        BrandEntity brand = new BrandEntity();
        brand.setId(1L);
        brand.setName("Audi");

        ModelEntity model = new ModelEntity();
        model.setId(1L);
        model.setName("A3");
        model.setBrand(brand);

        EngineEntity engine = engineRepository.findById(1L).orElse(null);

        CarEntity audi = new CarEntity();
        audi.setBrand(brand);
        audi.setModel(model);
        audi.setEngine(engine);
        audi.setYear(2004);
        audi.setMass(1275);
        audi.setFuelTankSize(55);
        audi.setMileage(244_000);
        audi.setTrunkSize(350);
        audi.setPrice(1_590_000);

        carRepository.save(audi);

        return new ResponseEntity<>("Ok", HttpStatus.OK);
    }
}
