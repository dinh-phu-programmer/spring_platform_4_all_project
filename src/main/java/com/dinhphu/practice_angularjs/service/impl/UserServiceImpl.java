package com.dinhphu.practice_angularjs.service.impl;

import com.dinhphu.practice_angularjs.model.UserDTO;
import com.dinhphu.practice_angularjs.repository.UserRepository;
import com.dinhphu.practice_angularjs.service.common.CommonAction;
import com.dinhphu.practice_angularjs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService1")
@Transactional
public class UserServiceImpl extends CommonAction<UserDTO,Long> implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        super(userRepository);
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public UserDTO save(UserDTO user) {
        return super.save(user);
    }

    @Override
    public UserDTO update(Long id, UserDTO user) {
        return super.update(id,user);
    }

    @Override
    public UserDTO delete(Long id) {
        return super.delete(id);
    }

    @Override
    public List<UserDTO> findAll() {
        return super.findAll();
    }

    @Override
    public UserDTO findById(Long id) {
        return super.findObjectById(id);
    }

    @Override
    public UserDTO register(UserDTO user) {
        return null;
    }
    @Override
    public List<UserDTO> findRelativeEmail(String email){
        return this.userRepository.findByUsernameLike(email);
    }

    @Override
    public UserDTO findByUsername(String username) {
        return this.userRepository.findByUsername(username);
    }
}
