package Abstract;

import Entities.Customer;

public class CustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) {

		System.out.println("Savaed to db : " + customer.getFirstName());

	}

}
