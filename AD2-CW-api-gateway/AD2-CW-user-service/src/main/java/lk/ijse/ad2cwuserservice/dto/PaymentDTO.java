package lk.ijse.ad2cwuserservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaymentDTO implements Serializable {

    private String paymentCode;
    private Date date;
    private Time time;
    private double price;

//    public PaymentDTO(String paymentCode, Date date, Time time, double price) {
//        this.paymentCode = paymentCode;
//        this.date = date;
//        this.time = time;
//        this.price = price;
//    }
//
//    public String getPaymentCode() {
//        return paymentCode;
//    }
//
//    public void setPaymentCode(String paymentCode) {
//        this.paymentCode = paymentCode;
//    }
//
//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    public Time getTime() {
//        return time;
//    }
//
//    public void setTime(Time time) {
//        this.time = time;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }

}
