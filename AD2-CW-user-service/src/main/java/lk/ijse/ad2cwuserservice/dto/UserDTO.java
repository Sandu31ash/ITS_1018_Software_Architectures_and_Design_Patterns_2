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
public class UserDTO implements Serializable {

    private String userId;
    private String userName;
    private String password;

}
