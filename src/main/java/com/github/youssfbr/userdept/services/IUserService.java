package com.github.youssfbr.userdept.services;

import com.github.youssfbr.userdept.entities.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
}
