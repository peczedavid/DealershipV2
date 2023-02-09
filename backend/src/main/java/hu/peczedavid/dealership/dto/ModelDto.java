package hu.peczedavid.dealership.dto;

import hu.peczedavid.dealership.entity.ModelEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ModelDto {

    private Long id;
    private String name;

    // TODO: make into mapper
    public static ModelDto fromModelEntity(ModelEntity modelEntity) {
        ModelDto modelDto = new ModelDto();

        modelDto.setId(modelEntity.getId());
        modelDto.setName(modelEntity.getName());

        return modelDto;
    }
}
