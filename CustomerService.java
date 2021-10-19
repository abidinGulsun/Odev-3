package Abstract;

import Entities.Customer;

public interface CustomerService extends Entity {

	void Save(Customer customer);
}
