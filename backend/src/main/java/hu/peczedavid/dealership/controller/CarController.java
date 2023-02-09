package hu.peczedavid.dealership.controller;

import hu.peczedavid.dealership.entity.CarEntity;
import hu.peczedavid.dealership.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public ResponseEntity<List<CarEntity>> getAll() {
        List<CarEntity> carEntities = carService.findAll();
        return new ResponseEntity<>(carEntities, HttpStatus.OK);
    }

}
