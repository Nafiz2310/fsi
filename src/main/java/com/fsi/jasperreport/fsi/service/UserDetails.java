package com.fsi.jasperreport.fsi.service;

import com.fsi.jasperreport.fsi.entity.User;

import java.util.Optional;

public interface UserDetails {
    Optional<User> findAllBy(String USERID);
}
