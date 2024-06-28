package lk.ijse.ad2cwticketservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    // RestTemplate Configuration
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
