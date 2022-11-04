package in.edu.ssn.cse.customer.service.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.edu.ssn.cse.customer.service.dao.mapper.CustomerMapper;
import in.edu.ssn.cse.customer.service.model.Customer;

@Component
public class CustomerDAO {

	@Autowired
	private CustomerMapper customerMapper;

	public boolean createCustomer(Customer customer) {

		return customerMapper.createCustomer(customer) == 1;
	}
}
