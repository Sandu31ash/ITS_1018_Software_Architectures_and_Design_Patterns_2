package lk.ijse.ad2cwvehicleservice.dao;

import lk.ijse.ad2cwvehicleservice.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo  extends JpaRepository<VehicleEntity, String> {

}
