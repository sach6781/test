package com.cg.greatOutdoors.controller;

import com.cg.greatOutdoors.entity.Address;
import com.cg.greatOutdoors.exception.AddressException;
import com.cg.greatOutdoors.service.AddressServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AddressManagementController {
	
	@Autowired
	AddressServiceImplementation pService;
	
	
	 @RequestMapping("/home")
	    String home() {
	        return "Welcome to the Address Management System!!";
	    }
		
	@GetMapping("/home/show")
	public List<Address> getAddress() {
		return pService.getAllAddress();
	}
	
	@PostMapping("/home/add")
	public ResponseEntity<Integer> addAddress(@RequestBody Address address){
		int pid=pService.addAddress(address);
		return new ResponseEntity<Integer>(pid,HttpStatus.OK);		
		
	}
	
	@GetMapping("/home/show/{id}")
    public ResponseEntity<Object> viewById(@PathVariable("id") int id){
    	     Address address = pService.findById(id);
    	     if(address == null) throw new AddressException("Address with id: "+id+" does not exist or deleted!!");
    	     return new ResponseEntity<>(address,HttpStatus.OK);
	
    }
    
    @DeleteMapping("/home/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") int id){ 	
    	     Boolean status = pService.deletes(id);
    	     if(!status) throw new AddressException("Address with id: "+id+" does not found!!");
    	     return new ResponseEntity<>("Address with id: "+id+ " is deleted successfully!!",HttpStatus.GONE);
    	
    	
    }
    @PutMapping("/home/update")
    public ResponseEntity<Object> update(@RequestBody Address address){
    	   pService.update(address);
    	   return new ResponseEntity<>("Address Updated Successfully!!",HttpStatus.ACCEPTED);
    	
    }
   
	
	
	
	

}
 