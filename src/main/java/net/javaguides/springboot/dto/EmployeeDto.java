package net.javaguides.springboot.dto;

import java.util.List;

import net.javaguides.springboot.model.Address;
import net.javaguides.springboot.model.Employee;

public class EmployeeDto {
	private long id;
	private String firstName;
	private String lastName;
	private String emailId;
	private List<AddressDto> addresses;
	
	public EmployeeDto() {		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public List<AddressDto> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<AddressDto> addresses) {
		this.addresses = addresses;
	}
}
