package edu.miu.productreview.service;

import edu.miu.productreview.model.Category;
import edu.miu.productreview.model.Product;
import edu.miu.productreview.model.Users;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    public List<Product> getAllProduct();
    public Optional<Product> getProductById(int id);
    public Product createProduct(Product product);
    public Product updateProduct(Product product);
    public void deleteProductById(int id);

    public List<Product> getProductByNameContains(String name);

    public List<Product> getProductByCategory(Category category);
}
