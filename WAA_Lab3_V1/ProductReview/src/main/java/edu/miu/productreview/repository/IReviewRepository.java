package edu.miu.productreview.repository;

import edu.miu.productreview.model.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IReviewRepository extends CrudRepository<Review, Integer> {
//    public List<Review> findReviewByProductById(int id);
    public List<Review> getReviewByProductId(int id);
}
