package edu.miu.productreview.controller;

import edu.miu.productreview.model.Category;
import edu.miu.productreview.model.Product;
import edu.miu.productreview.service.ICategoryService;
import edu.miu.productreview.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public List<Category> getAllCategory() {
        return categoryService.getAllCategory();
    }

    @GetMapping("/{id}")
    public Optional<Category> getCategoryById(@PathVariable int id) {
        return categoryService.getCategoryById(id);
    }

    @PostMapping
    public Category createCategory( @RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    @PutMapping
    public Category updateCategory(@RequestBody Category category) {
        return categoryService.updateCategory(category);
    }

    @DeleteMapping("/{id}")
    public void deletecategoryById(@PathVariable int id) {
        categoryService.deletecategoryById(id);
    }
}
