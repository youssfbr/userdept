package com.github.youssfbr.userdept.services.impl;

import com.github.youssfbr.userdept.entities.User;
import com.github.youssfbr.userdept.repositories.IUserRepository;
import com.github.youssfbr.userdept.services.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    private final IUserRepository userRepository;

    public UserServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User NOT FOUND with Id: " + id));
    }

    @Override
    @Transactional
    public User userCreate(User user) {
        return userRepository.save(user);
    }
}
