package dev.flix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.flix.entity.StreamService;

public interface StreamServiceRepository extends JpaRepository<StreamService, Long> {
}
