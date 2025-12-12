package com.example.springProjects.Lovable_clone.repository;

import com.example.springProjects.Lovable_clone.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
