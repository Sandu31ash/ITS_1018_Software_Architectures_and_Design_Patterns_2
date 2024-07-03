package lk.ijse.ad2cwticketservice.controller;

import lk.ijse.ad2cwticketservice.dto.TicketDTO;
import lk.ijse.ad2cwticketservice.sevice.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/ticket")
@RequiredArgsConstructor
public class TicketController {

    private final TicketService ticketService;

    @GetMapping("health")
    public String checkItemHealth(){
        return "Ticket health ok!";
    }

    @PostMapping("save")
    public TicketDTO saveTicket(@RequestBody TicketDTO ticketDTO){
//        ticket.setTicketCode(ticket.getTicketCode());
//        ticket.setTicketPrice(ticket.getTicketPrice());
//        ticket.setStatus(ticket.getStatus());
//
//        return ticket;

        System.out.println(ticketDTO);
        return ticketService.saveTicket(ticketDTO);
    }

   @GetMapping("get")
    public ResponseEntity<?> getTicketByTicketCode(@RequestHeader String ticketCode){
       TicketDTO ticketDTO = ticketService.getTicketByTicketCode(ticketCode);
        return ResponseEntity.ok(ticketDTO);
    }

//    @PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<?> updateTicket(@RequestBody TicketDTO ticketDTO) {
//        ticketService.updateTicket(ticketDTO);
//        return ResponseEntity.ok().build();
//    }

    @GetMapping("/getAll")
    public List<TicketDTO> getAllTicket(){
        return ticketService.getAllTicket();
    }

    @PutMapping("/updateStatus")
    public ResponseEntity<?> updateTicket(@RequestParam String ticketCode) {
        ticketService.updateStatus(ticketCode);
        return ResponseEntity.ok().build();
    }


//    @DeleteMapping("/delete")
//    public ResponseEntity<?> deleteTicket(@RequestHeader String ticketCode){
//        ticketService.deleteTicket(ticketCode);
//        return ResponseEntity.ok().build();
//    }

}
