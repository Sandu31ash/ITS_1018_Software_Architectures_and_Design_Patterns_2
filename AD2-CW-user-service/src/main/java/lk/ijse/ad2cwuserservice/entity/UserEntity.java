package lk.ijse.ad2cwuserservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="user")
@Entity
public class UserEntity {

    @Id
    private String userId;
    private String userName;
    private String password;

}
