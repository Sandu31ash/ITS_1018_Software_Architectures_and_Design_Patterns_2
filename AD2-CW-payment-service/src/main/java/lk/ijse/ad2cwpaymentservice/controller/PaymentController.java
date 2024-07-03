package lk.ijse.ad2cwpaymentservice.controller;

import lk.ijse.ad2cwpaymentservice.dto.PaymentDTO;
import lk.ijse.ad2cwpaymentservice.dto.TicketDTO;
import lk.ijse.ad2cwpaymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/payment")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/health")
    public String checkHealth(){
        return "Payment health ok!";
    }

    @PostMapping("save")
    public PaymentDTO savePayment(@RequestBody PaymentDTO paymentDTO){
//        payment.setPaymentCode(payment.getPaymentCode()+" updated code");
//        payment.setDate(payment.getDate());
//        payment.setTime(payment.getTime());
//        payment.setPrice(payment.getPrice());
//
//        return payment;

        System.out.println(paymentDTO);

//        updateTicketInPaymentClass(paymentDTO.getTicketCode());

        String url = "http://ticket-service/api/v1/ticket/updateStatus";

        // Building the URI with parameters
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("ticketCode", paymentDTO.getTicketCode());

        // Make the PUT request
        restTemplate.put(builder.toUriString(), null);


        return paymentService.savePayment(paymentDTO);

    }

    @GetMapping("get")
    public ResponseEntity<?> getPaymentByPaymentCode(@RequestHeader String paymentCode){
        PaymentDTO paymentDTO = paymentService.getPaymentByPaymentCode(paymentCode);
        return ResponseEntity.ok(paymentDTO);
    }

    @GetMapping("/getAll")
    public List<PaymentDTO> getAllPayment(){
        return paymentService.getAllPayment();
    }

//    @PutMapping("/updateTicketStatus")
//    public void updateTicketInPaymentClass(String ticketCode){

//        restTemplate.put("http://ticket-service/api/v1/ticket/updateStatus?ticketCode="+ticketCode, String.class);

//        String url = "http://ticket-service/api/v1/ticket/updateStatus";
//
//        // Building the URI with parameters
//        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
//                .queryParam("ticketCode", ticketCode);
//
//        // Make the PUT request
//        restTemplate.put(builder.toUriString(), null);

//    }


}
