package com.amandafortuna.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amandafortuna.course.entities.User;

@RestController
@RequestMapping(value= "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> finsAll() {
		User u = new User(1L, "MAria", "d@mmmm", "198717163553", "GFDER22");
		return ResponseEntity.ok().body(u);
	}
	
}
