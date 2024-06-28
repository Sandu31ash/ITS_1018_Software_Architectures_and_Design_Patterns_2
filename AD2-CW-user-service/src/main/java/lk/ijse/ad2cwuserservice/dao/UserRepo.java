package lk.ijse.ad2cwuserservice.dao;

import lk.ijse.ad2cwuserservice.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, String> {

}
