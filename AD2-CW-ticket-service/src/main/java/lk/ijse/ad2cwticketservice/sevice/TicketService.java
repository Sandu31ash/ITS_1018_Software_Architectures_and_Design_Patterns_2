package lk.ijse.ad2cwticketservice.sevice;

import lk.ijse.ad2cwticketservice.dto.TicketDTO;

import java.util.List;

public interface TicketService {

    TicketDTO saveTicket(TicketDTO ticketDTO);
    List<TicketDTO> getAllTicket();
    TicketDTO getTicketByTicketCode(String ticketCode);

    void updateStatus(String ticketCode);
//    void updateTicket(TicketDTO ticketDTO);
//    void deleteTicket(String ticketCode);

}
