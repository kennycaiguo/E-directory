package org.bildit.model;

import java.io.Serializable;

/**
 * Name: Contact
 * 
 * @author Dejan
 *
 */

public class Contact implements Serializable{

	//Data fields
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	private String email;
	private int idContact;

	//No-args Constructor
	public Contact() {
	}

	//Constructor with specified values
	public Contact(String firstName, String lastName, String phoneNumber, String address, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
	}

	
	//Getters and Setters
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdContact() {
		return idContact;
	}

	public void setId(int idContact) {
		this.idContact = idContact;
	}
}
