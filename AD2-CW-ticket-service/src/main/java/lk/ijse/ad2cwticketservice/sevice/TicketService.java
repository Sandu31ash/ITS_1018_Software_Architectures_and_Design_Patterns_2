package lk.ijse.ad2cwticketservice.sevice;

import lk.ijse.ad2cwticketservice.dto.TicketDTO;

public interface TicketService {

    TicketDTO saveTicket(TicketDTO ticketDTO);
//    List<CustomerDTO> getAllCustomer();
    TicketDTO getTicketByTicketCode(String ticketCode);
//    void updateTicket(TicketDTO ticketDTO);
//    void deleteTicket(String ticketCode);

}
