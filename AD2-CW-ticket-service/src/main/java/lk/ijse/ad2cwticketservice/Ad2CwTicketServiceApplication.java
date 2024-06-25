package lk.ijse.ad2cwticketservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ad2CwTicketServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ad2CwTicketServiceApplication.class, args);
    }

}
