package com.dinhphu.practice_angularjs.service;

import com.dinhphu.practice_angularjs.model.UserDTO;
import com.dinhphu.practice_angularjs.service.common.CommonService;

import java.util.List;

public interface UserService extends CommonService<UserDTO,Long> {
    UserDTO register(UserDTO user);
    List<UserDTO> findRelativeEmail(String email);
    UserDTO findByUsername(String username);
}
