package com.example.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.pojo.AccountDetails;
import com.example.service.WithdrawService;

public interface AccountRepository extends MongoRepository<AccountDetails, ObjectId> {

	AccountDetails findBy_id(ObjectId _id);
	WithdrawService withdraw(double amount, double accountBalance);



}
