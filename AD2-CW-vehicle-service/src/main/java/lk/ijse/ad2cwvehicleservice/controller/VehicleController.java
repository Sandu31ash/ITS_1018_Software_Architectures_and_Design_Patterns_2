package lk.ijse.ad2cwvehicleservice.controller;

import lk.ijse.ad2cwvehicleservice.dto.VehicleDTO;
import lk.ijse.ad2cwvehicleservice.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/vehicle")
@RequiredArgsConstructor
public class VehicleController {

    private final VehicleService vehicleService;

    @GetMapping("health")
    public String checkItemHealth(){
        return "Vehicle health ok!";
    }

    @PostMapping("save")
    public VehicleDTO saveItem(@RequestBody VehicleDTO vehicleDTO){
//        vehicle.setVehicleNo(vehicle.getVehicleNo());
//        vehicle.setVehicleType(vehicle.getVehicleType());
//        return vehicle;

        System.out.println(vehicleDTO);
        return vehicleService.saveVehicle(vehicleDTO);

    }

}
