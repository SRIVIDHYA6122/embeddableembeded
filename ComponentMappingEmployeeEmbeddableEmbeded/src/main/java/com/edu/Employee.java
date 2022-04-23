package com.edu;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emphibernate")
public class Employee {
	@Id
private int eid;
	@Column(length=20)
private String ename;
private String pincode;
	
	@Embedded
	Address address;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(int eid, String ename,String pincode, Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.pincode=pincode;
		this.address = address;
		
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", pincode=" + pincode + ", address=" + address + "]";
	}
    
	

}

