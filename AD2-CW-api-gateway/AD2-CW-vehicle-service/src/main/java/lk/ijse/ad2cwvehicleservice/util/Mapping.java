package lk.ijse.ad2cwvehicleservice.util;

import lk.ijse.ad2cwvehicleservice.dto.VehicleDTO;
import lk.ijse.ad2cwvehicleservice.entity.VehicleEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Mapping {

    private final ModelMapper mapper;


    public VehicleDTO toVehicleDTO(VehicleEntity vehicle) {
        return mapper.map(vehicle, VehicleDTO.class);
    }
    public VehicleEntity toVehicle(VehicleDTO vehicleDTO) {
        return mapper.map(vehicleDTO, VehicleEntity.class);
    }
    public List<VehicleDTO> toVehicleDTOList(List<VehicleEntity> vehicles) {
        return mapper.map(vehicles, List.class);
    }

}
