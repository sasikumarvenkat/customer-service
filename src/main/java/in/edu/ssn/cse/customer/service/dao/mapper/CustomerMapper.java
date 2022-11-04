package in.edu.ssn.cse.customer.service.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import in.edu.ssn.cse.customer.service.model.Customer;

@Mapper
public interface CustomerMapper {
	
	@Insert("INSERT INTO `customer_db`.`customer` (`name`, `email`, `phone`, `ssn`) "
			+ "VALUES (#{name}, #{email}, #{phone}, #{ssn})")
	@Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
	int createCustomer(Customer customer);
}
