package lk.ijse.ad2cwticketservice.sevice.ServiceImpl;

import jakarta.transaction.Transactional;
import lk.ijse.ad2cwticketservice.dao.TicketRepo;
import lk.ijse.ad2cwticketservice.dto.TicketDTO;
import lk.ijse.ad2cwticketservice.entity.TicketEntity;
import lk.ijse.ad2cwticketservice.sevice.TicketService;
import lk.ijse.ad2cwticketservice.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {

    private final TicketRepo ticketRepo;

    private final Mapping mapping;

    @Override
    public TicketDTO saveTicket(TicketDTO ticketDTO) {
        return mapping.toTicketDTO(ticketRepo.save(mapping.toTicket(ticketDTO)));
    }

    @Override
    public TicketDTO getTicketByTicketCode(String ticketCode) {
        return mapping.toTicketDTO(ticketRepo.getTicketByTicketCode(ticketCode));
    }

    @Override
    public void updateStatus(String ticketCode) {
        TicketEntity ticketEntity = ticketRepo.getTicketByTicketCode(ticketCode);
        ticketEntity.setStatus("paid");
        ticketRepo.save(ticketEntity);

//        vehicle.setVehicleOwner(vehicleDTO.getVehicleOwner());
//        vehicleRepo.save(vehicle);
    }

    @Override
    public List<TicketDTO> getAllTicket() {
        return mapping.toTicketDTOList(ticketRepo.findAll());
    }

//    @Override
//    public void deleteVehicle(String vehicleNo) {
//        vehicleRepo.deleteById(vehicleNo);
//    }

//    @Override
//    public void updateTicket(TicketDTO ticketDTO) {
//        TicketEntity ticket = ticketRepo.getTicketByTicketCode(ticketDTO.getTicketCode());
//        ticket.setVehicleNo(ticketDTO.getVehicleNo());
//        ticket.setUserId(ticketDTO.getUserId());
//        ticket.setDate(ticketDTO.getDate());
//        ticket.setTime(ticketDTO.getTime());
//        ticket.setTicketPrice(ticketDTO.getTicketPrice());
//        ticket.setStatus(ticketDTO.getStatus());
//        ticket.setDescription(ticketDTO.getDescription());
//        ticketRepo.save(ticket);
//    }

}
