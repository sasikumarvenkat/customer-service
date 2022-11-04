package in.edu.ssn.cse.customer.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Customer {

	private int id;
	private String name, email, phone;
	@Builder.Default
	private String ssn="234567";

}