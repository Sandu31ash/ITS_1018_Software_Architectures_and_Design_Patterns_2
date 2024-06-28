package lk.ijse.ad2cwuserservice.util;

import lk.ijse.ad2cwuserservice.dto.UserDTO;
import lk.ijse.ad2cwuserservice.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Mapping {

    private final ModelMapper mapper;

    public UserDTO toUserDTO(UserEntity ticket) {
        return mapper.map(ticket, UserDTO.class);
    }
    public UserEntity toUser(UserDTO userDTO) {
        return mapper.map(userDTO, UserEntity.class);
    }
    public List<UserDTO> toUserDTOList(List<UserEntity> users) {
        return mapper.map(users, List.class);
    }


}
