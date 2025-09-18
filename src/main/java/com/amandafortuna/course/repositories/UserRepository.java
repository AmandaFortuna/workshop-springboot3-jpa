package com.amandafortuna.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amandafortuna.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
