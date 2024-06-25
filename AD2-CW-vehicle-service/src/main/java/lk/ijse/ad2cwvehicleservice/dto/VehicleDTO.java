package lk.ijse.ad2cwvehicleservice.dto;

import java.io.Serializable;

public class VehicleDTO implements Serializable {

    private String vehicleNo;
    private String vehicleType;

    public VehicleDTO(String vehicleNo, String vehicleType) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
