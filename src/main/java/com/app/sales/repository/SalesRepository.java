package com.app.sales.repository;

import com.app.sales.entity.Sales;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * salerepository.
 */
@Repository
public interface SalesRepository extends MongoRepository<Sales, ObjectId> {

}
