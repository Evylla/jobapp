package com.embarx.firstjoapp.review;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ReviewService {

    List<Review> getAllReviews(Long companyId);
    boolean addReview(Long companyId, Review review);
    Review getReview(Long companyId, Long id);
    boolean updateReview(Long companyId, Long id, Review information);
    boolean deleteReview(Long companyId, Long reviewId);
}
