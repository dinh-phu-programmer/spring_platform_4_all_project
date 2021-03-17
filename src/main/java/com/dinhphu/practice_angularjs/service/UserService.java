package com.dinhphu.practice_angularjs.service;

import com.dinhphu.practice_angularjs.model.UserDTO;

public interface UserService extends CommonService<UserDTO,Long>{
    UserDTO register(UserDTO user);
}
