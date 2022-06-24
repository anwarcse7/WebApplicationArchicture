package edu.miu.productreview.service.Impl;

import edu.miu.productreview.model.Category;
import edu.miu.productreview.model.Product;
import edu.miu.productreview.repository.ICategoryRepository;
import edu.miu.productreview.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategory() {
        return (List<Category>) categoryRepository.findAll();
    }

    @Override
    public Optional<Category> getCategoryById(int id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void deletecategoryById(int id) {
        categoryRepository.deleteById(id);
    }
}
