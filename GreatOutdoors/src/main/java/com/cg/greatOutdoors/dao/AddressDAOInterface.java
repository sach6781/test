package com.cg.greatOutdoors.dao;

import java.util.List;

import com.cg.greatOutdoors.entity.Address;

public interface AddressDAOInterface {
	
	public List<Address> getAddress(); // get All
	
	public int insertAddress(Address address); // Post (Create)
	
	public Address findById(int id); // get by ID 

	public Boolean delete(int id); // delete by ID

	public void update(Address address); // Update

}
