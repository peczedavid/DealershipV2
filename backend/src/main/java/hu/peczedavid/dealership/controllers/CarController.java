package hu.peczedavid.dealership.controllers;

import hu.peczedavid.dealership.dto.CarDto;
import hu.peczedavid.dealership.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping
    public ResponseEntity<List<CarDto>> getAll() {
        List<CarDto> carDtoList = carService.findAll();
        return new ResponseEntity<>(carDtoList, HttpStatus.OK);
    }

}
