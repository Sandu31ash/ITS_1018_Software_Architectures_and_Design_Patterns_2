package lk.ijse.ad2cwvehicleservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="vehicle")
@Entity
public class VehicleEntity implements SuperEntity{

    @Id
    private String vehicleNo;
    private String vehicleOwner;
    private String vehicleType;
    private String vehicleColor;

}
