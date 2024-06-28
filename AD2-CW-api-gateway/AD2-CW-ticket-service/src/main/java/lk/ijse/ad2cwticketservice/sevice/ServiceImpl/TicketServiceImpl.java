package lk.ijse.ad2cwticketservice.sevice.ServiceImpl;

import jakarta.transaction.Transactional;
import lk.ijse.ad2cwticketservice.dao.TicketRepo;
import lk.ijse.ad2cwticketservice.dto.TicketDTO;
import lk.ijse.ad2cwticketservice.sevice.TicketService;
import lk.ijse.ad2cwticketservice.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {

    private final TicketRepo ticketRepo;

    private final Mapping mapping;

    @Override
    public TicketDTO saveTicket(TicketDTO ticketDTO) {
        //customerDTO.setCCode(UUID.randomUUID().toString());
        return mapping.toTicketDTO(ticketRepo.save(mapping.toTicket(ticketDTO)));
    }

}
