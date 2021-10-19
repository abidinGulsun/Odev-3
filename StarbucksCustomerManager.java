package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerManager;
import Entities.Customer;

public class StarbucksCustomerManager extends CustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		} else {
			System.out.println("Not a valid person");
		}
	}

}
