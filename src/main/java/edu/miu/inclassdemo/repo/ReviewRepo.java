package edu.miu.inclassdemo.repo;

import edu.miu.inclassdemo.domain.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface ReviewRepo extends CrudRepository<Review, Integer> {
}
