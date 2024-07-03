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
<<<<<<< HEAD
import java.util.logging.Logger;
=======
>>>>>>> 555018377788fbb74ca2a30971e5c82e9fae296d
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
@Transactional
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepo vehicleRepo;

    private final Mapping mapping;

    private static final Logger logger = Logger.getLogger(VehicleServiceImpl.class.getName());

    @Override
    public VehicleDTO saveVehicle(VehicleDTO vehicleDTO) {
<<<<<<< HEAD
        if (vehicleDTO == null) {
            logger.info("VehicleDTO can't be null: " + vehicleDTO);
            throw new IllegalArgumentException("VehicleDTO can't be null");
        }

        String vehicleNo = vehicleDTO.getVehicleNo();
        String vehicleOwner = vehicleDTO.getVehicleOwner();
        String vehicleType = vehicleDTO.getVehicleColor();
        String vehicleColor = vehicleDTO.getVehicleColor();

        if (vehicleNo == null || vehicleNo.isEmpty()) {
            logger.info("Vehicle number can't be null: " + vehicleNo);
            throw new IllegalArgumentException("Vehicle number can't be null");
        }

        if(vehicleOwner == null || vehicleOwner.isEmpty() || vehicleType == null || vehicleType.isEmpty() || vehicleColor == null || vehicleColor.isEmpty()){
            logger.info("Fill all the fields before save!");
            throw new IllegalArgumentException("Some field is not field yet!");
        }

        String vehicleNoRegex = "^(?:[A-Z]{2}|[A-Z]{3}|C[A-Z]{2})-\\d{4}$";
        Pattern pattern = Pattern.compile(vehicleNoRegex);
        Matcher matcher = pattern.matcher(vehicleNo);

        if (!matcher.matches()) {
            logger.info("Incorrect vehicle number entry!: " + vehicleNo);
            throw new IllegalArgumentException("Incorrect vehicle number entry! " + vehicleNo);
        }

        logger.info("Saving vehicle: " + vehicleDTO);
        return mapping.toVehicleDTO(vehicleRepo.save(mapping.toVehicle(vehicleDTO)));
=======

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

>>>>>>> 555018377788fbb74ca2a30971e5c82e9fae296d
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
    public List<VehicleDTO> getAllVehicle() {
        return mapping.toVehicleDTOList(vehicleRepo.findAll());
    }

    @Override
    public void updateVehicle(VehicleDTO vehicleDTO) {
        VehicleEntity vehicle = vehicleRepo.getVehicleByVehicleNo(vehicleDTO.getVehicleNo());
        vehicle.setVehicleOwner(vehicleDTO.getVehicleOwner());
        vehicle.setVehicleType(vehicleDTO.getVehicleType());
        vehicle.setVehicleColor(vehicleDTO.getVehicleColor());
        vehicleRepo.save(vehicle);
    }

    @Override
    public void deleteVehicle(String vehicleNo) {
        vehicleRepo.deleteById(vehicleNo);
    }


}
