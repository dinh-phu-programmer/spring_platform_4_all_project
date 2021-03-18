package com.dinhphu.practice_angularjs.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="users")
public class UserDTO extends RootClass implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="username")
    private String username;
    @Column(name="full_name")
    private String fullName;
    @Column(name="phone")
    private String phone;
    @Column(name="role")
    private String role;
    @Column(name="authorities")
    private String[] authorities;

    private boolean isActivate;

    private boolean isUnLocked;

    public boolean isActivate() {
        return isActivate;
    }

    public void setActivate(boolean activate) {
        isActivate = activate;
    }

    public boolean isUnLocked() {
        return isUnLocked;
    }

    public void setUnLocked(boolean unLocked) {
        isUnLocked = unLocked;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String[] getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String[] authorities) {
        this.authorities = authorities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
