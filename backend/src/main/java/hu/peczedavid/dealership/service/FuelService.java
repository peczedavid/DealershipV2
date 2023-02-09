package hu.peczedavid.dealership.service;

import hu.peczedavid.dealership.entity.fuel.FuelEntity;
import hu.peczedavid.dealership.repository.FuelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuelService {

    @Autowired
    private FuelRepository fuelRepository;

    public List<FuelEntity> findAll() {
        return fuelRepository.findAll();
    }
}
