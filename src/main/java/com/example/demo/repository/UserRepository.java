package com.example.demo.repository;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: xieyougen
 * @email: xieyougen@tuandai.com
 * @description:
 * @date: 2018/3/12 17:34
 */
public interface UserRepository extends JpaRepository<User,Long> {
    public User findUserByName(String name);
}
