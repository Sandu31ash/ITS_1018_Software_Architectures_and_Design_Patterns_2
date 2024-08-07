package lk.ijse.ad2cwuserservice.controller;

import lk.ijse.ad2cwuserservice.dto.ItemDTO;
import lk.ijse.ad2cwuserservice.dto.PaymentDTO;
import lk.ijse.ad2cwuserservice.dto.UserDTO;
import lk.ijse.ad2cwuserservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("health")
    public String checkUserHealth(){
        return "User health Okay!";
    }

    @PostMapping("saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        System.out.println(userDTO);
        return userService.saveUser(userDTO);
    }

    @GetMapping("userPaymentHealth")
    public String getUserHealth(){
        // return restTemplate.getForObject("http://localhost:8082/api/v1/item/health", String.class);
        return restTemplate.getForObject("http://payment-service/api/v1/payment/health", String.class); // with load balance
    }

    @PostMapping("userPaymentSave")
    public PaymentDTO saveItemInUserClass(@RequestBody PaymentDTO payment){
        // return restTemplate.postForObject("http://localhost:8082/api/v1/item/saveItem", item, itemDTO.class);
        return restTemplate.postForObject("http://payment-service/api/v1/payment/save", payment, PaymentDTO.class); // with load balance
    }

    @GetMapping("/getAllUser")
    public List<UserDTO> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("get")
    public ResponseEntity<?> getUserByUserNo(@RequestHeader String userId){
        UserDTO userDTO = userService.getUserByUserId(userId);
        return ResponseEntity.ok(userDTO);
    }

    @PutMapping(value = "/updateUser", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateUser(@RequestBody UserDTO userDTO) {
        userService.updateUser(userDTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/deleteUser")
    public ResponseEntity<?> deleteUser(@RequestHeader String userId){
        userService.deleteUser(userId);
        return ResponseEntity.ok().build();
    }

}
