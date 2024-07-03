package lk.ijse.ad2cwuserservice.service;

import lk.ijse.ad2cwuserservice.dto.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO saveUser(UserDTO userDTO);
    List<UserDTO> getAllUser();
    UserDTO getUserByUserId(String userId);
    void updateUser(UserDTO userDTO);
    void deleteUser(String userId);

}
