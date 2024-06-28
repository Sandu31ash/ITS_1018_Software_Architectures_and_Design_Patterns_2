package lk.ijse.ad2cwvehicleservice.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.ad2cwvehicleservice.dao.VehicleRepo;
import lk.ijse.ad2cwvehicleservice.dto.VehicleDTO;
import lk.ijse.ad2cwvehicleservice.entity.VehicleEntity;
import lk.ijse.ad2cwvehicleservice.service.VehicleService;
import lk.ijse.ad2cwvehicleservice.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepo vehicleRepo;

    private final Mapping mapping;

    @Override
    public VehicleDTO saveVehicle(VehicleDTO vehicleDTO) {
        //customerDTO.setCCode(UUID.randomUUID().toString());
        return mapping.toVehicleDTO(vehicleRepo.save(mapping.toVehicle(vehicleDTO)));
    }

//    @Override
//    public List<CustomerDTO> getAllCustomer() {
//        return mapping.toCustomerDTOList(customerRepo.findAll());
//    }

    @Override
    public VehicleDTO getVehicleByVehicleNo(String vehicleNo) {
        return mapping.toVehicleDTO(vehicleRepo.getVehicleByVehicleNo(vehicleNo));
    }

//    @Override
//    public void updateVehicle(VehicleDTO vehicleDTO) {
//        VehicleEntity vehicle = vehicleRepo.getVehicleByVehicleNo(vehicleDTO.getVehicleNo());
//        vehicle.setVehicleOwner(vehicleDTO.getVehicleOwner());
//        vehicle.setVehicleType(vehicleDTO.getVehicleType());
//        vehicle.setVehicleColor(vehicleDTO.getVehicleColor());
//        vehicleRepo.save(vehicle);
//    }

//    @Override
//    public void deleteCustomer(String cusCode) {
//        customerRepo.deleteById(cusCode);
//    }


}
