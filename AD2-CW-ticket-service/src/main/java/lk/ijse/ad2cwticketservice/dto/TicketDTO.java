package lk.ijse.ad2cwticketservice.dto;

import java.io.Serializable;

public class TicketDTO implements Serializable {

    private String ticketCode;
    private double ticketPrice;
    private String status;      //paid/unpaid

    public TicketDTO(String ticketCode, double ticketPrice, String status) {
        this.ticketCode = ticketCode;
        this.ticketPrice = ticketPrice;
        this.status = status;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketCode(String itemCode) {
        this.ticketCode = ticketCode;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
