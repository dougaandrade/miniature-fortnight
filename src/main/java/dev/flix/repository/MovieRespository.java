package dev.flix.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.flix.entity.Category;
import dev.flix.entity.Movie;

public interface MovieRespository extends JpaRepository<Movie, Long> {

    List<Movie> findMovieByCategories(List<Category> categories);
}
