package com.cg.greatOutdoors.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


import org.springframework.stereotype.Repository;

import com.cg.greatOutdoors.entity.Address;

@Repository

public class AddressDAOImplement implements AddressDAOInterface{
	
	@PersistenceContext
	EntityManager em;

	@Override
	public List<Address> getAddress() {
	String qStr="SELECT address FROM Address address";
		TypedQuery<Address> query=em.createQuery(qStr,Address.class);
		return query.getResultList();
	}

	@Override
	public int insertAddress(Address address) {
		em.persist(address);
		return address.getId();
		
	}
		
	@Override
	public Address findById(int id) {
        return em.find(Address.class, id);
	
	}

	@Override
	public Boolean delete(int id) {
		
		   Address address=em.find(Address.class, id);
		   if(address!=null) {
			   em.remove(address);
			   return true;
		   }
		   return false;
		   
	}

	
	@Override
	public void update(Address address) {	
		      Address updateAddress=em.find(Address.class,address.getAddressId());
		      updateAddress.setBuildingNo(address.getBuildingNo());
		      updateAddress.setCity(address.getCity());
		      updateAddress.setState(address.getState());
		      updateAddress.setField(address.getField());
		      updateAddress.setZip(address.getZip());
		      em.merge(updateAddress);
		
	}
	
	
	
	
	
	

}
