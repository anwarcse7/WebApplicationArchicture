package edu.miu.productreview.service.Impl;

import edu.miu.productreview.model.Category;
import edu.miu.productreview.model.Product;
import edu.miu.productreview.model.Users;
import edu.miu.productreview.repository.IProductRepository;
import edu.miu.productreview.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProductById(int id) {
        productRepository.deleteById(id);
    }

//    @Override
//    public Product findProductByName(String name) {
//        return productRepository.findProductByName(name);
//    }

    @Override
    public List<Product> getProductByNameContains(String name) {
        return (List<Product>) productRepository.getProductByNameContains(name);
    }

    @Override
    public List<Product> getProductByCategory(Category category) {
        return (List<Product>) productRepository.getProductByCategory(category);
    }
}
