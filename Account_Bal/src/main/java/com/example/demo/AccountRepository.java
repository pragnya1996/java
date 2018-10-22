package com.example.demo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<AccountDetails, ObjectId> {

	AccountDetails findBy_id(ObjectId _id);
    


}
