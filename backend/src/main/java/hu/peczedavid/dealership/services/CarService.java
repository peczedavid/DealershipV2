package hu.peczedavid.dealership.services;

import hu.peczedavid.dealership.dto.CarDto;
import hu.peczedavid.dealership.mappers.CarMapper;
import hu.peczedavid.dealership.repositories.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public List<CarDto> findAll() {
        return carMapper.toCarDtoList(carRepository.findAll());
    }
}
