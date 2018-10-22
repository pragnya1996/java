package com.example.demo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="account")
public class AccountDetails {
	
	 @Id
	 public ObjectId _id; 

	String accountName;
	double accountBalance;
	
	public AccountDetails() {
		super();
	}
	
	public AccountDetails(ObjectId _id,String accountName, double accountBalance) {
		super();
		this._id=_id;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	 public String get_id()
	 { 
		 return _id.toHexString(); 
	 }
	  public void set_id(ObjectId _id) { this._id = _id; }


	public String getAccountName() {
		return accountName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	@Override
	public String toString() {
		return "AccountDetails [accountName=" + accountName + ", accountBalance=" + accountBalance + "]";
	}
	
	

}
