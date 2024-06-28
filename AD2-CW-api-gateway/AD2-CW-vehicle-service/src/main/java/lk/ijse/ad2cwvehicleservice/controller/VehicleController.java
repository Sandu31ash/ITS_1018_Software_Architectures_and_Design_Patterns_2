package lk.ijse.ad2cwvehicleservice.controller;

import lk.ijse.ad2cwvehicleservice.dto.VehicleDTO;
import lk.ijse.ad2cwvehicleservice.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
    public VehicleDTO saveVehicle(@RequestBody VehicleDTO vehicleDTO){
//        vehicle.setVehicleNo(vehicle.getVehicleNo());
//        vehicle.setVehicleType(vehicle.getVehicleType());
//        return vehicle;

        System.out.println(vehicleDTO);
        return vehicleService.saveVehicle(vehicleDTO);
    }

    @GetMapping("get")
    public ResponseEntity<?> getVehicleByVehicleNo(@RequestHeader String vehicleNo){
        VehicleDTO vehicleDTO = vehicleService.getVehicleByVehicleNo(vehicleNo);
        return ResponseEntity.ok(vehicleDTO);
    }

//    @PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<?> updateVehicle(@RequestBody VehicleDTO vehicleDTO) {
//        vehicleService.updateVehicle(vehicleDTO);
//        return ResponseEntity.ok().build();
//    }

}
