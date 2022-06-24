package edu.miu.productreview.service;

import edu.miu.productreview.model.Review;
import edu.miu.productreview.model.Users;

import java.util.List;
import java.util.Optional;

public interface IReviewService {
    public List<Review> getAllReview();
    public Optional<Review> getReviewById(int id);
    public Review createReview(Review review);
    public Review updateReview(Review review);
    public void deleteReviewById(int id);

    public List<Review> getReviewByProductId(int id);
}
