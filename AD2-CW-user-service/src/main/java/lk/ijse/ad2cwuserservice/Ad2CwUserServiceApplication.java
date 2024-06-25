package lk.ijse.ad2cwuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ad2CwUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ad2CwUserServiceApplication.class, args);
    }

}
