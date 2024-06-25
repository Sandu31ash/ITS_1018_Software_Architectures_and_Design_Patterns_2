package lk.ijse.ad2cwitemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ad2CwItemServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ad2CwItemServiceApplication.class, args);
    }

}
