package lk.ijse.ad2cwuserservice.service.ServiceImpl;

import jakarta.transaction.Transactional;
import lk.ijse.ad2cwuserservice.dao.UserRepo;
import lk.ijse.ad2cwuserservice.dto.UserDTO;
import lk.ijse.ad2cwuserservice.entity.UserEntity;
import lk.ijse.ad2cwuserservice.service.UserService;
import lk.ijse.ad2cwuserservice.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    private final Mapping mapping;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDTO saveUser(UserDTO userDTO) {

        try {
            String encodedPassword = passwordEncoder.encode(userDTO.getPassword());
            userDTO.setPassword(encodedPassword);
            return mapping.toUserDTO(userRepo.save(mapping.toUser(userDTO)));
        } catch (Exception ex) {
            throw new RuntimeException("Error saving user: " + ex.getMessage());
        }
    }

    @Override
    public List<UserDTO> getAllUser() {
        return mapping.toUserDTOList(userRepo.findAll());
    }

    @Override
    public UserDTO getUserByUserId(String userId) {
        return mapping.toUserDTO(userRepo.getUserByUserId(userId));
    }

    @Override
    public void updateUser(UserDTO userDTO) {
        UserEntity user = userRepo.getUserByUserId(userDTO.getUserId());
        user.setUserName(userDTO.getUserName());
        user.setPassword(userDTO.getPassword());
        userRepo.save(user);
    }

    @Override
    public void deleteUser(String userId) {
        userRepo.deleteById(userId);
    }

}
