package com.github.youssfbr.userdept.services;

import com.github.youssfbr.userdept.entities.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    User findById(Long id);
    User userCreate(User user);
}
