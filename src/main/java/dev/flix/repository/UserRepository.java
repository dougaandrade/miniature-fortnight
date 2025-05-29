package dev.flix.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import dev.flix.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<UserDetails> findByEmail(String email);
}
