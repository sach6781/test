package com.cg.greatOutdoors.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.greatOutdoors.dao.AddressDAOImplement;
import com.cg.greatOutdoors.entity.Address;
@Transactional
@Service
public class AddressServiceImplementation  implements AddressServiceInterface{
	
	@Autowired
	AddressDAOImplement pDao;

	@Override
	public List<Address> getAllAddress() {
		// TODO Auto-generated method stub
		return pDao.getAddress();
	}

	@Override
	public int addAddress(Address address) {
		// TODO Auto-generated method stub
		
		
		return pDao.insertAddress(address);
	}
	
	
	public Address findById(int id) {
		
		  return pDao.findById(id);
	}

	public Boolean deletes(int id) {
		
		   return pDao.delete(id);
	}

	public void update(Address address) {
		
		    pDao.update(address);
	}
	
	

}
