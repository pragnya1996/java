package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;

	@RequestMapping(value="/bank")
	public List<AccountDetails> getall()
	{
		
		return accountRepository.findAll();
		}
	/*@RequestMapping(value="/hello")
	public String hello()
	{
		return "hello world";
	}*/
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




