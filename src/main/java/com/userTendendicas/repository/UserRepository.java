package com.userTendendicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userTendendicas.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
