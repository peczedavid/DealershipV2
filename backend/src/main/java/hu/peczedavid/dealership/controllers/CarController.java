package hu.peczedavid.dealership.controllers;

import hu.peczedavid.dealership.dto.CarDto;
import hu.peczedavid.dealership.dto.request.CarSaveRequest;
import hu.peczedavid.dealership.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public ResponseEntity<CarDto> getById(@PathVariable int id) {
        CarDto carDto = carService.findById((long) id);
        return new ResponseEntity<>(carDto, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CarDto> saveCarEntity(@RequestBody CarSaveRequest request) {
        CarDto carDto = carService.save(request);
        return new ResponseEntity<>(carDto, HttpStatus.OK);
    }
}
