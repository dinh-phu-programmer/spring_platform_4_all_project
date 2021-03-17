package com.dinhphu.practice_angularjs.repository;

import com.dinhphu.practice_angularjs.model.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDTO,Long>{

}
