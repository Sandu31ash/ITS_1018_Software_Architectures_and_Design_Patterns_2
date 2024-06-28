package lk.ijse.ad2cwuserservice.service.ServiceImpl;

import jakarta.transaction.Transactional;
import lk.ijse.ad2cwuserservice.dao.UserRepo;
import lk.ijse.ad2cwuserservice.dto.UserDTO;
import lk.ijse.ad2cwuserservice.service.UserService;
import lk.ijse.ad2cwuserservice.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    private final Mapping mapping;

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return mapping.toUserDTO(userRepo.save(mapping.toUser(userDTO)));
    }

}
