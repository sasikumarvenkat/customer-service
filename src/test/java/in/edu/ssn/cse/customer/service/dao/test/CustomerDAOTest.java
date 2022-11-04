package in.edu.ssn.cse.customer.service.dao.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.edu.ssn.cse.customer.service.dao.CustomerDAO;
import in.edu.ssn.cse.customer.service.model.Customer;
import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class CustomerDAOTest {

	@Autowired
	private CustomerDAO customerDAO;

	@Test
	public void createCustomerShouldSucceed() {

		Customer customer = Customer.builder()		
				.email("sasi@ssn.in")
				.name("Sasi")
				.phone("123456")
				.ssn("12347654")
				.build();
		customerDAO.createCustomer(customer);
		log.debug("Customer:" + customer);
	}
}
