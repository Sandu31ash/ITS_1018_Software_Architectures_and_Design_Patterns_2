package lk.ijse.ad2cwvehicleservice.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.ad2cwvehicleservice.dao.VehicleRepo;
import lk.ijse.ad2cwvehicleservice.dto.VehicleDTO;
import lk.ijse.ad2cwvehicleservice.entity.VehicleEntity;
import lk.ijse.ad2cwvehicleservice.service.VehicleService;
import lk.ijse.ad2cwvehicleservice.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.Console;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
@Transactional
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepo vehicleRepo;

    private final Mapping mapping;

    @Override
    public VehicleDTO saveVehicle(VehicleDTO vehicleDTO) {

        String vehicleNo = vehicleDTO.getVehicleNo();
        String vehicleOwnerRegex = "^(?:[A-Z]{2}|[A-Z]{3}|C[A-Z]{2})-\\d{4}$";
        Pattern pattern = Pattern.compile(vehicleOwnerRegex);
        Matcher matcher = pattern.matcher(vehicleDTO.getVehicleOwner());

//        if(vehicleDTO!=null){
//            if(vehicleNo!=null && matcher.matches()){
//                return mapping.toVehicleDTO(vehicleRepo.save(mapping.toVehicle(vehicleDTO)));
//            }else{
//                System.out.println("a");
//            }
//
//        }else {
//            throw new IllegalArgumentException("VehicleDTO can't be null");
//        }

        //////////////////////////////////////////////////////////

        if(vehicleDTO==null){
            throw new IllegalArgumentException("VehicleDTO can't be null");
        }else if (vehicleNo==null && !matcher.matches()){
            throw new IllegalArgumentException("incorrect vehicleNo entry!");
        }else {
            return mapping.toVehicleDTO(vehicleRepo.save(mapping.toVehicle(vehicleDTO)));

        }

    }

//    @Override
//    public List<CustomerDTO> getAllCustomer() {
//        return mapping.toCustomerDTOList(customerRepo.findAll());
//    }

    @Override
    public VehicleDTO getVehicleByVehicleNo(String vehicleNo) {
        return mapping.toVehicleDTO(vehicleRepo.getVehicleByVehicleNo(vehicleNo));
    }

    @Override
    public void updateVehicle(VehicleDTO vehicleDTO) {
        VehicleEntity vehicle = vehicleRepo.getVehicleByVehicleNo(vehicleDTO.getVehicleNo());
        vehicle.setVehicleOwner(vehicleDTO.getVehicleOwner());
        vehicle.setVehicleType(vehicleDTO.getVehicleType());
        vehicle.setVehicleColor(vehicleDTO.getVehicleColor());
        vehicleRepo.save(vehicle);
    }

//    @Override
//    public void deleteCustomer(String cusCode) {
//        customerRepo.deleteById(cusCode);
//    }


}
