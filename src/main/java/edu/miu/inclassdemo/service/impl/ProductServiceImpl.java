package edu.miu.inclassdemo.service.impl;

import edu.miu.inclassdemo.domain.Product;
import edu.miu.inclassdemo.domain.Review;
import edu.miu.inclassdemo.repo.ProductRepo;
import edu.miu.inclassdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Override
    public List<Product> findAll() {
        List<Product> list = new ArrayList<>();
        productRepo.findAll().forEach(list::add);
        return list;
    }

    @Override
    public Product findById(int id) {
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public void save(Product p) {
        productRepo.save(p);
    }

    @Override
    public void delete(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public void update(int id, Product p) {
//        productRepo.update(id,p);
    }

    @Override
    public Review getReviewByProductId(int pId, int reviewId) {
        return null;
//        return productRepo.getReviewByProductId(pId,reviewId);
    }

    @Override
    public List<Product> findAllPriceGreaterThan(int price) {
        return productRepo.findAllByPriceGreaterThan(price);
    }

    @Override
    public List<Review> findReviews(int id) {
        return productRepo.findReviews(id);
    }
}
