package lk.ijse.ad2cwapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ad2CwApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ad2CwApiGatewayApplication.class, args);
    }

}
