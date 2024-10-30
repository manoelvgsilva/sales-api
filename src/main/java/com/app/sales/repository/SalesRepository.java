package com.app.sales.repository;

import com.app.sales.entity.Sales;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepository extends MongoRepository<Sales, String> {

}
