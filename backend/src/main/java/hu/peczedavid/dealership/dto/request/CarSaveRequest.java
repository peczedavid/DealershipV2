package hu.peczedavid.dealership.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CarSaveRequest {

    private Long brandId;
    private Long modelId;
    private Long engineId;
    private int year;
    private int mass;
    private int fuelTankSize;
    private int mileage;
    private int trunkSize;
    private int price;

}
