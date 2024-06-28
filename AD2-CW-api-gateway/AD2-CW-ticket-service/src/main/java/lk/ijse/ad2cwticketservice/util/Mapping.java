package lk.ijse.ad2cwticketservice.util;

import lk.ijse.ad2cwticketservice.dto.TicketDTO;
import lk.ijse.ad2cwticketservice.entity.TicketEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Mapping {

    private final ModelMapper mapper;

    public TicketDTO toTicketDTO(TicketEntity ticket) {
        return mapper.map(ticket, TicketDTO.class);
    }
    public TicketEntity toTicket(TicketDTO ticketDTO) {
        return mapper.map(ticketDTO, TicketEntity.class);
    }
    public List<TicketDTO> toTicketDTOList(List<TicketEntity> tickets) {
        return mapper.map(tickets, List.class);
    }


}
