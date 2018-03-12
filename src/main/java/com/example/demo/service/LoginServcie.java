package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: xieyougen
 * @email: xieyougen@tuandai.com
 * @description:
 * @date: 2018/3/12 17:26
 */
@Service
public class LoginServcie {

    @Autowired
    private UserRepository userRepository;

    public User finsByName(String name){
        return userRepository.findUserByName(name);
    }
}
