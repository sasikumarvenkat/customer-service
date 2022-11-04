package in.edu.ssn.cse.customer.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.edu.ssn.cse.customer.service.delegate.CustomerServiceDelegate;
import in.edu.ssn.cse.customer.service.model.Customer;

@RestController
@RequestMapping(path = "/customer")
public class CustomerServiceController {
	
	@Autowired
	private CustomerServiceDelegate customerServiceDelegate;
	
	@GetMapping
	public String getCustomerByName(
			@RequestParam(name = "firstname")String name) {
		return "hello: Mr./Ms. " + name;
	}
	
	@PostMapping(path="/create-new", 
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE
			)
	public Customer createCustomer(
			@RequestBody
			Customer customer) {
		customerServiceDelegate.addNewCustomer(customer);
		return customer;
	}
}


