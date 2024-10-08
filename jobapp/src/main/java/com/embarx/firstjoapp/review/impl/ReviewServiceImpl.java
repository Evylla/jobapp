package com.embarx.firstjoapp.review.impl;

import com.embarx.firstjoapp.company.Company;
import com.embarx.firstjoapp.company.CompanyService;
import com.embarx.firstjoapp.review.Review;
import com.embarx.firstjoapp.review.ReviewRepository;
import com.embarx.firstjoapp.review.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    private final CompanyService companyService;

    private ReviewServiceImpl(ReviewRepository reviewRepository, CompanyService companyService){
        this.reviewRepository = reviewRepository;
        this.companyService = companyService;
    };

    @Override
    public List<Review> getAllReviews(Long companyId) {
        return reviewRepository.findByCompanyId(companyId);
    }

    @Override
    public boolean addReview(Long companyId, Review review){
        Company company = companyService.getCompanyById(companyId);
        if (company != null){
            review.setCompany(company);
            reviewRepository.save(review);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Review getReview(Long companyId, Long id){
        List<Review> reviews = reviewRepository.findByCompanyId(companyId);
        return reviews.stream()
                .filter(review -> review.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean updateReview(Long companyId, Long id, Review information){
        if (companyService.getCompanyById(companyId) != null){
            information.setCompany(companyService.getCompanyById(companyId));
            information.setId(id);
            reviewRepository.save(information);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteReview(Long companyId, Long reviewId){
        if (companyService.getCompanyById(companyId) != null && reviewRepository.existsById(reviewId)){
            Review review = reviewRepository.findById(reviewId).orElse(null);
            Company company = review.getCompany();
            company.getReviews().remove(review);

            companyService.updateCompany(companyId, company);
            reviewRepository.deleteById(reviewId);
            return true;
        } else {
            return false;
        }
    }

}
