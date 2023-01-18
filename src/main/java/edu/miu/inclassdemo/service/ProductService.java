package edu.miu.inclassdemo.service;

import edu.miu.inclassdemo.domain.Product;
import edu.miu.inclassdemo.domain.Review;

import java.util.List;

public interface ProductService {

    public List<Product> findAll();
    Product findById(int id);
    void save(Product p);
    void delete(int id);
    void update(int id, Product p);
    Review getReviewByProductId(int pId, int reviewId);
    List<Product> findAllPriceGreaterThan(int price);

    List<Review> findReviews(int id);
}
