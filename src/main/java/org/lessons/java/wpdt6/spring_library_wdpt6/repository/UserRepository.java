package org.lessons.java.wpdt6.spring_library_wdpt6.repository;

import org.lessons.java.wpdt6.spring_library_wdpt6.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
