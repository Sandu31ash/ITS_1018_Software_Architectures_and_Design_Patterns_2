package lk.ijse.ad2cwticketservice.controller;

import lk.ijse.ad2cwticketservice.dto.TicketDTO;
import lk.ijse.ad2cwticketservice.sevice.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
    public TicketDTO saveItem(@RequestBody TicketDTO ticketDTO){
//        ticket.setTicketCode(ticket.getTicketCode());
//        ticket.setTicketPrice(ticket.getTicketPrice());
//        ticket.setStatus(ticket.getStatus());
//
//        return ticket;

        System.out.println(ticketDTO);
        return ticketService.saveTicket(ticketDTO);
    }

}
