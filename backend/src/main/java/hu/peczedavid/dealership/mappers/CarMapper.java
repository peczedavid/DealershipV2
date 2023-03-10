package hu.peczedavid.dealership.mappers;

import hu.peczedavid.dealership.dto.CarDto;
import hu.peczedavid.dealership.dto.request.CarSaveRequest;
import hu.peczedavid.dealership.entities.CarEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {

    CarDto toCarDto(CarEntity carEntity);

    CarEntity fromCarSaveRequestToCarEntity(CarSaveRequest request);

    List<CarDto> toCarDtoList(List<CarEntity> carEntityList);
}
