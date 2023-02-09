package hu.peczedavid.dealership.service;

import hu.peczedavid.dealership.entity.CarEntity;
import hu.peczedavid.dealership.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public List<CarEntity> findAll() {
        return carRepository.findAll();
    }
}
