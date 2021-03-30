package com.example.codeclan.relationships.repositories;

import com.example.codeclan.relationships.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

//set up models check them
// set up repos chck them
// enxt step would be to test