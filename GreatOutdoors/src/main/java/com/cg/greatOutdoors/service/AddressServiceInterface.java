package com.cg.greatOutdoors.service;
import java.util.List;


import com.cg.greatOutdoors.entity.Address;
public interface AddressServiceInterface {
	
	
	public List<Address> getAllAddress();
	
	public int addAddress(Address address);
		
	public Address findById(int id); // get by ID 

	public Boolean deletes(int id); // delete by ID

	public void update(Address address); // Update
		
	

	
	

}
