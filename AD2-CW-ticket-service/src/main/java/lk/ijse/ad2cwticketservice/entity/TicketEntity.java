package lk.ijse.ad2cwticketservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="ticket")
@Entity
public class TicketEntity implements SuperEntity{

    @Id
    private String ticketCode;
    private String vehicleNo;
    private String userId;
    private Date date;
    private Time time;
    private double ticketPrice;
    private String status;      //paid/unpaid
    private String description;

}
