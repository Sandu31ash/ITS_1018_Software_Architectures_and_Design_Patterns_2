package lk.ijse.ad2cwvehicleservice.service;

import lk.ijse.ad2cwvehicleservice.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {
    VehicleDTO saveVehicle(VehicleDTO vehicleDTO);
//    List<CustomerDTO> getAllCustomer();
    VehicleDTO getVehicleByVehicleNo(String vehicleNo);
//    void updateVehicle(VehicleDTO vehicleDTO);
//    void deleteCustomer(String customerCode);
}
