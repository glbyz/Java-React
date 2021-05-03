package coffeShop;

public class StarbucksCustomerManager extends CustomerManager  {

	CustomerCheckService checkService;	
	
	public StarbucksCustomerManager(CustomerCheckService checkService) {
		this.checkService=checkService;
	}
	
	
	@Override
	public void save(Customer customer) {
		if (checkService.checkIfRealPerson(customer)) {
			System.out.println("Kimlik Do�rulamas� Yap�ld� : " + customer.firstName.toUpperCase() 
			+ " " +customer.lastName.toUpperCase() );
		}else {
			System.out.println("Kimlik Do�rulanamad�...");
		}
	}

}
