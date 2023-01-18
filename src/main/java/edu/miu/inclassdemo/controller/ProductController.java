package edu.miu.inclassdemo.controller;

import edu.miu.inclassdemo.domain.Product;
import edu.miu.inclassdemo.domain.Review;
import edu.miu.inclassdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> findAll(@RequestParam(value = "filter",required = false) Integer price){
        return price==null?productService.findAll():productService.findAllPriceGreaterThan(price);
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable("id") int id){
        return productService.findById(id);
    }




    @PostMapping
    public void save(@RequestBody Product product){
        productService.save(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        productService.delete(id);
    }

    @GetMapping("/{id}/reviews")
    public List<Review> getReviews(@PathVariable int id){
        return productService.findReviews(id);
    }


}
