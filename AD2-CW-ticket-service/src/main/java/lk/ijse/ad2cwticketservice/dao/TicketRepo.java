package lk.ijse.ad2cwticketservice.dao;

import lk.ijse.ad2cwticketservice.entity.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<TicketEntity, String> {

    TicketEntity getTicketByTicketCode(String ticketNo);

}
