package lk.ijse.ad2cwserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Ad2CwServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ad2CwServiceRegistryApplication.class, args);
    }

}
