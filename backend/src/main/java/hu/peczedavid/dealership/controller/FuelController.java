package hu.peczedavid.dealership.controller;

import hu.peczedavid.dealership.entity.fuel.FuelEntity;
import hu.peczedavid.dealership.service.FuelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/fuel")
public class FuelController {

    @Autowired
    private FuelService fuelService;

    @GetMapping
    public ResponseEntity<List<FuelEntity>> getAllFuels() {
        List<FuelEntity> fuelEntities = fuelService.findAll();
        return new ResponseEntity<>(fuelEntities, HttpStatus.OK);
    }

}
