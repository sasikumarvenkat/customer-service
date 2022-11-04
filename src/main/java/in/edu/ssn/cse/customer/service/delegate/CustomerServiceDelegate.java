package in.edu.ssn.cse.customer.service.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.edu.ssn.cse.customer.service.dao.CustomerDAO;
import in.edu.ssn.cse.customer.service.model.Customer;

@Service
public class CustomerServiceDelegate {

	@Autowired
	private CustomerDAO customerDAO;
	
	public boolean addNewCustomer(Customer customer) {
		
		//BusinessLogic
		customer.setEmail(customer.getEmail().toLowerCase());
		
		
		return customerDAO.createCustomer(customer);
	}
}