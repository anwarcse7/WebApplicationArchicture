package edu.miu.productreview.controller;

import edu.miu.productreview.model.Review;
import edu.miu.productreview.model.Users;
import edu.miu.productreview.service.IReviewService;
import edu.miu.productreview.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    private IReviewService reviewService;

    @GetMapping
    public List<Review> getAllUser() {
        return reviewService.getAllReview();
    }

    @GetMapping("/{id}")
    public Optional<Review> getReviewById(@PathVariable int id) {
        return reviewService.getReviewById(id);
    }

    @PostMapping
    public Review createUser( @RequestBody Review review) {
        return reviewService.createReview(review);
    }

    @PutMapping
    public Review updateReview(@RequestBody Review review) {
        return reviewService.updateReview(review);
    }

    @DeleteMapping("/{id}")
    public void deleteReviewById(@PathVariable int id) {
        reviewService.deleteReviewById(id);
    }

    @GetMapping("/reviewByProductId/{pid}")
    public List<Review> reviewByProductId(@PathVariable int pid) {
        return reviewService.getReviewByProductId(pid);
    }

}
