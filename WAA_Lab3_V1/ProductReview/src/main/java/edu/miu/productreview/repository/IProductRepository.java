package edu.miu.productreview.repository;

import edu.miu.productreview.model.Category;
import edu.miu.productreview.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends CrudRepository<Product, Integer> {
    public List<Product> getProductByNameContains(String name);

    public List<Product> getProductByCategory(Category cat);
}
