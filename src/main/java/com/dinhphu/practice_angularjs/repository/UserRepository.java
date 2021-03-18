package com.dinhphu.practice_angularjs.repository;

import com.dinhphu.practice_angularjs.model.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserDTO,Long>{
    List<UserDTO> findByUsernameContains(String username);
    List<UserDTO> findByUsernameContaining(String username);
    List<UserDTO> findByUsernameStartsWith(String username);
    List<UserDTO> findByUsernameLike(String username);
    List<UserDTO> findTop2ByUsernameIsContaining(String username);
    UserDTO findByUsername(String username);
}
