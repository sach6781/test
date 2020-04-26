package com.cg.greatOutdoors.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tbl_address")
public class Address implements Serializable{


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int addressId;
	
	@Column(length = 10, unique = true, nullable = false)
	private String buildingNo;
	@Column(length = 20, unique = true, nullable = false)
	private String city;
	@Column(length = 10, unique = true, nullable = false)
    private String state;
	@Column(length = 20, unique = true, nullable = false)
	private String field;
	@Column(length = 6, unique = true, nullable = false)
	private String zip;
	
	public Address() {
		super();
	}
	
	
	public Address(String buildingNo, String city, String state, String field, String zip) {
		super();
		this.buildingNo = buildingNo;
		this.city = city;
		this.state = state;
		this.field = field;
		this.zip = zip;
	}

	public int getId() {
		return addressId;
	}
	
	public void setId(int id) {
		this.addressId = id;
	}
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	
	public String getBuildingNo() {
		return buildingNo;
	}
	public void setBuildingNo(String buildingNo) {
		this.buildingNo = buildingNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

}

