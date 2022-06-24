package edu.miu.productreview.service.Impl;

import edu.miu.productreview.model.Review;
import edu.miu.productreview.model.Users;
import edu.miu.productreview.repository.IReviewRepository;
import edu.miu.productreview.service.IReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService implements IReviewService {
    @Autowired
    IReviewRepository reviewRepository;

    @Override
    public List<Review> getAllReview() {
        return (List<Review>) reviewRepository.findAll();
    }

    @Override
    public Optional<Review> getReviewById(int id) {
        return reviewRepository.findById(id);
    }

    @Override
    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public Review updateReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public void deleteReviewById(int id) {
        reviewRepository.deleteById(id);
    }

    @Override
    public List<Review> getReviewByProductId(int id) {
        return reviewRepository.getReviewByProductId(id);
    }
}
