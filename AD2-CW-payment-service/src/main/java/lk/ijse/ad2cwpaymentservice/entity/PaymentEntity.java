package lk.ijse.ad2cwpaymentservice.entity;

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
@Table(name="payment")
@Entity
public class PaymentEntity implements SuperEntity{

    @Id
    private String paymentCode;
    private String ticketCode;
    private String userId;
    private String vehicleNo;
    private Date date;
    private Time time;
    private String payMethod;
    private double ticketPrice;

}
