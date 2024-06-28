package lk.ijse.ad2cwticketservice.dto;

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

//    public TicketDTO(String ticketCode, double ticketPrice, String status) {
//        this.ticketCode = ticketCode;
//        this.ticketPrice = ticketPrice;
//        this.status = status;
//    }
//
//    public String getTicketCode() {
//        return ticketCode;
//    }
//
//    public double getTicketPrice() {
//        return ticketPrice;
//    }
//
//    public void setTicketCode(String itemCode) {
//        this.ticketCode = ticketCode;
//    }
//
//    public void setTicketPrice(double ticketPrice) {
//        this.ticketPrice = ticketPrice;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
}
