package com.dinhphu.practice_angularjs.controller;

import com.dinhphu.practice_angularjs.model.UserDTO;
import com.dinhphu.practice_angularjs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        List<UserDTO> users = this.userService.findAll();
        return new ResponseEntity<List<UserDTO>>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getCurrentUser(@PathVariable Long id) {
        UserDTO user = this.userService.findById(id);
        return new ResponseEntity<UserDTO>(user, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<UserDTO> createNewUser(@RequestBody UserDTO userDTO) {
        UserDTO user = this.userService.save(userDTO);
        return new ResponseEntity<UserDTO>(user, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Long id, @RequestBody UserDTO userDTO) {
        UserDTO user = this.userService.update(id, userDTO);
        return new ResponseEntity<UserDTO>(user, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<UserDTO> deleteUser(@PathVariable Long id) {
        UserDTO user= this.userService.delete(id);
        return new ResponseEntity<UserDTO>(user,HttpStatus.OK);
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<List<UserDTO>> findRelativeEmail(@PathVariable String email){
        String pattern="%d%a";
        List<UserDTO> users=this.userService.findRelativeEmail(pattern);
        return new ResponseEntity<List<UserDTO>>(users,HttpStatus.OK);
    }

}
