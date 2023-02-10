package hu.peczedavid.dealership.services;

import hu.peczedavid.dealership.mappers.CarMapper;
import hu.peczedavid.dealership.repositories.BrandRepository;
import hu.peczedavid.dealership.repositories.CarRepository;
import hu.peczedavid.dealership.repositories.EngineRepository;
import hu.peczedavid.dealership.repositories.ModelRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CarServiceTest {

    @Mock
    private CarRepository carRepository;
    @Mock
    private EngineRepository engineRepository;
    @Mock
    private BrandRepository brandRepository;
    @Mock
    private ModelRepository modelRepository;
    @Mock
    private CarMapper carMapper;
    private CarService carService;

    @Before
    public void setUp() {
        carService = new CarService(carRepository, engineRepository, brandRepository, modelRepository, carMapper);
    }

    @Test
    public void test() {
        carService.findById(1L);
    }
}
