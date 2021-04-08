package com.onlineshopping.flipcart.repository;

import com.onlineshopping.flipcart.model.Flipcart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class Flipcartrepo implements MongoRepository<Flipcart,String> {
}
