package edu.miu.productreview.controller;

import edu.miu.productreview.model.Category;
import edu.miu.productreview.model.Product;
import edu.miu.productreview.model.Review;
import edu.miu.productreview.service.IProductService;
import edu.miu.productreview.service.IReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public Product createProduct( @RequestBody Product review) {
        return productService.createProduct(review);
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product review) {
        return productService.updateProduct(review);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable int id) {
        productService.deleteProductById(id);
    }

    @GetMapping("/name/{name}")
    public List<Product> getAllProduct(@PathVariable String name) {
        return productService.getProductByNameContains(name);
    }

    @GetMapping("/category/{category}")
    public List<Product> getProductByCategory(@PathVariable Category category) {
        return productService.getProductByCategory(category);
    }

}
