package edu.miu.productreview.service;

import edu.miu.productreview.model.Category;
import edu.miu.productreview.model.Product;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    public List<Category> getAllCategory();
    public Optional<Category> getCategoryById(int id);
    public Category createCategory(Category category);
    public Category updateCategory(Category category);
    public void deletecategoryById(int id);
}
