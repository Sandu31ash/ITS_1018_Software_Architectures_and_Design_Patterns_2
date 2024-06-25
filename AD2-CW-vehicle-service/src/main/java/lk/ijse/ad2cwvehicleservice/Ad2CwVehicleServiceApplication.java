package lk.ijse.ad2cwvehicleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ad2CwVehicleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ad2CwVehicleServiceApplication.class, args);
    }

}
