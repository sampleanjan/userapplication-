package com.example.Userservice.repository;





import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Userservice.models.User;



public interface UserRepository extends JpaRepository<User, Long> {
}