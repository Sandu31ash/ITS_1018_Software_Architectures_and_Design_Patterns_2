package lk.ijse.ad2cwuserservice;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class Ad2CwUserServiceApplication {

    @Bean
    ModelMapper modelMapper(){
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(Ad2CwUserServiceApplication.class, args);
    }

    @Bean
    @LoadBalanced // to use one port for
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
