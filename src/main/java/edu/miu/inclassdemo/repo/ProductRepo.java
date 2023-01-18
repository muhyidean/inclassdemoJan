package edu.miu.inclassdemo.repo;


import edu.miu.inclassdemo.domain.Product;
import edu.miu.inclassdemo.domain.Review;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProductRepo extends CrudRepository<Product,Integer> {

//    Review getReviewByProductId(int pId, int reviewId);

    @Query("select p.reviews from Product p where p.id = :id")
    List<Review> findReviews(int id);

    List<Product> findAllByPriceGreaterThan(int price);
}
