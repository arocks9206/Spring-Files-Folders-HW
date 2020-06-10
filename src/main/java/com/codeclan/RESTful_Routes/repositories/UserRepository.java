package com.codeclan.RESTful_Routes.repositories;

import com.codeclan.RESTful_Routes.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
