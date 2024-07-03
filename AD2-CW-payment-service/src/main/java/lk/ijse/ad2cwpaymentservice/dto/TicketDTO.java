package lk.ijse.ad2cwpaymentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TicketDTO implements Serializable {

    private String ticketCode;
    private String vehicleNo;
    private String userId;
    private Date date;
    private Time time;
    private double ticketPrice;
    private String status;      //paid/unpaid
    private String description;

}
