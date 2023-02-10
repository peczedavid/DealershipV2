package hu.peczedavid.dealership.services;

import hu.peczedavid.dealership.dto.CarDto;
import hu.peczedavid.dealership.dto.request.CarSaveRequest;
import hu.peczedavid.dealership.entities.BrandEntity;
import hu.peczedavid.dealership.entities.CarEntity;
import hu.peczedavid.dealership.entities.EngineEntity;
import hu.peczedavid.dealership.entities.ModelEntity;
import hu.peczedavid.dealership.mappers.CarMapper;
import hu.peczedavid.dealership.repositories.BrandRepository;
import hu.peczedavid.dealership.repositories.CarRepository;
import hu.peczedavid.dealership.repositories.EngineRepository;
import hu.peczedavid.dealership.repositories.ModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;
    private final EngineRepository engineRepository;
    private final BrandRepository brandRepository;
    private final ModelRepository modelRepository;
    private final CarMapper carMapper;

    public List<CarDto> findAll() {
        return carMapper.toCarDtoList(carRepository.findAll());
    }

    public CarDto findById(Long id) {
        return carMapper.toCarDto(carRepository.findById(id).orElse(null));
    }

    public CarDto save(CarSaveRequest request) {
        EngineEntity engine = engineRepository.findById(request.getEngineId()).orElse(null);
        BrandEntity brand = brandRepository.findById(request.getBrandId()).orElse(null);
        ModelEntity model = modelRepository.findById(request.getModelId()).orElse(null);

        CarEntity carEntity = carMapper.fromCarSaveRequestToCarEntity(request);
        carEntity.setEngine(engine);
        carEntity.setBrand(brand);
        carEntity.setModel(model);

        carRepository.save(carEntity);

        return carMapper.toCarDto(carEntity);
    }

}
