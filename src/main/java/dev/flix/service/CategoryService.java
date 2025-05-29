package dev.flix.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.flix.entity.Category;
import dev.flix.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }

}
