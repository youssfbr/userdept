package com.github.youssfbr.userdept.repositories;

import com.github.youssfbr.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
