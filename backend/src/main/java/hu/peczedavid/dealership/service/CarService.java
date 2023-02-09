package hu.peczedavid.dealership.service;

import hu.peczedavid.dealership.entity.CarEntity;
import hu.peczedavid.dealership.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<CarEntity> findAll() {
        return carRepository.findAll();
    }
}
