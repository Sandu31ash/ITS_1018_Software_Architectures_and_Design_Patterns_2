package lk.ijse.ad2cwuserservice.controller;

import lk.ijse.ad2cwuserservice.dto.ItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

//    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("health")
    public String checkUserHealth(){
        return "User health Okay!";
    }

    @GetMapping("itemHealth")
    public String getUserHealth(){
        // return restTemplate.getForObject("http://localhost:8082/api/v1/item/health", String.class);
        return restTemplate.getForObject("http://item-service/api/v1/item/health", String.class); // with load balance
    }

    @PostMapping("userSaveItem")
    public ItemDTO saveItemInUserClass(@RequestBody ItemDTO item){
        // return restTemplate.postForObject("http://localhost:8082/api/v1/item/saveItem", item, itemDTO.class);
        return restTemplate.postForObject("http://item-service/api/v1/item/saveItem", item, ItemDTO.class); // with load balance
    }

}
