import Abstract.CustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		Customer abidin = new Customer(1, "zeynül Abidin", "Gülsün", 1998, "23527697102");

		CustomerManager customerManager = new CustomerManager();
		customerManager.Save(abidin);

		CustomerManager customerManagerStarbucks = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManagerStarbucks.Save(abidin);

		CustomerManager customerManagerNero = new NeroCustomerManager();
		customerManagerNero.Save(abidin);

		String abcString = "23527697102";

	}

}
