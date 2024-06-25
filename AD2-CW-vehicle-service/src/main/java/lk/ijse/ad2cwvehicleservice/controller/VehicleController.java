package lk.ijse.ad2cwvehicleservice.controller;

import lk.ijse.ad2cwvehicleservice.dto.VehicleDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/vehicle")
public class VehicleController {

    @GetMapping("health")
    public String checkItemHealth(){
        return "Vehicle health ok!";
    }

    @PostMapping("save")
    public VehicleDTO saveItem(@RequestBody VehicleDTO vehicle){
        vehicle.setVehicleNo(vehicle.getVehicleNo());
        vehicle.setVehicleType(vehicle.getVehicleType());
        return vehicle;

//        System.out.println(vehicleDTO);
//        return vehicleService.saveCustomer(vehicleDTO);

    }

}
