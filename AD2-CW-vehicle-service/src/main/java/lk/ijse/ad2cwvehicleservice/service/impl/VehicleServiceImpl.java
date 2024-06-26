package lk.ijse.ad2cwvehicleservice.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.ad2cwvehicleservice.dao.VehicleRepo;
import lk.ijse.ad2cwvehicleservice.dto.VehicleDTO;
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
//
//    @Override
//    public CustomerDTO getCustomerByCusCode(String cusCode) {
//        return mapping.toCustomerDTO(customerRepo.getCustomerByCusCode(cusCode));
//    }
//
//    @Override
//    public void updateCustomer(CustomerDTO customerDTO) {
//        CustomerEntity customer = customerRepo.getCustomerByCusCode(customerDTO.getCusCode());
//        customer.setCusName(customerDTO.getCusName());
//        customer.setGender(customerDTO.getGender());
//        customer.setJoinedDate(customerDTO.getJoinedDate());
//        customer.setLevel(customerDTO.getLevel());
//        customer.setTotPoints(customerDTO.getTotPoints());
//        customer.setDob(customerDTO.getDob());
//        customer.setAdd1(customerDTO.getAdd1());
//        customer.setAdd2(customerDTO.getAdd2());
//        customer.setAdd3(customerDTO.getAdd3());
//        customer.setAdd4(customerDTO.getAdd4());
//        customer.setAdd5(customerDTO.getAdd5());
//        customer.setContact(customerDTO.getContact());
//        customer.setEmail(customerDTO.getEmail());
//        customer.setRecPurData(customerDTO.getRecPurData());
//        customerRepo.save(customer);
//    }
//
//    @Override
//    public void deleteCustomer(String cusCode) {
//        customerRepo.deleteById(cusCode);
//    }


}
