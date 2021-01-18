package com.fsi.jasperreport.fsi.service;

import com.fsi.jasperreport.fsi.entity.User;
import com.fsi.jasperreport.fsi.repository.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsService implements UserDetails{

    private static final Logger logger = LogManager.getLogger(UserDetailsService.class);


    @Autowired
    private UserRepository userRepository;
    @Override
    public Optional<User> findAllBy(String USERID) {
        return userRepository.findById(USERID);
    }
}
