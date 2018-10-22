package com.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.AccountDetails;
import com.example.repository.AccountRepository;
import com.example.service.WithdrawService;

@RestController
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;

	@GetMapping("/withdraw")
	public WithdrawService getdeposit() {
		return accountRepository.withdraw(1200, 5000);
	}
}
	
	/*@RequestMapping(value="/add", method=RequestMethod.POST)
	public AccountDetails add(@Valid @RequestBody AccountDetails details){
		details.set_id(ObjectId.get());
		accountRepository.save(details);
		
		return details;
		
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	  public void delete(@PathVariable ObjectId id) {
		accountRepository.delete( accountRepository.findBy_id(id));
	  }
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	  public AccountDetails modifyPetById(@PathVariable("id") ObjectId id, @Valid @RequestBody AccountDetails details) {
	    details.set_id(id);
	    return accountRepository.save(details);
	  }
}*/




