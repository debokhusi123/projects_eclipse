package pack;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	private Identifier id;
	@Autowired
private Address address;
	public Customer() {
		super();
		System.out.println("Customer() is created");
		
	}
		

	public Customer(Identifier id) {
		super();
		System.out.println("Customer(Identifier) is created");
		
	
		this.id = id;
	}


	public Identifier getId() {
		return id;
	}


	public void setId(Identifier id) {
		System.out.println("setId() is called");
		this.id = id;
	}
	public void getInformations()
	{
	address.display();
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	

	}



