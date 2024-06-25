package lk.ijse.ad2cwticketservice.controller;

import lk.ijse.ad2cwticketservice.dto.TicketDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/ticket")
public class TicketController {

    @GetMapping("health")
    public String checkItemHealth(){
        return "Ticket health ok!";
    }

    @PostMapping("save")
    public TicketDTO saveItem(@RequestBody TicketDTO ticket){
        ticket.setTicketCode(ticket.getTicketCode());
        ticket.setTicketPrice(ticket.getTicketPrice());
        ticket.setStatus(ticket.getStatus());

        return ticket;
    }

}
