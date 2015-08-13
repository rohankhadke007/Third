package com.rohan.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The Class User.
 */
@Entity
@Table(name="user")
public class User extends BaseEntity {

	/** The first name. */
	private String firstName;
	
	/** The last name. */
	private String lastName;
	
	/** The state. */
	private String state;
	
	/** The city. */
	private String city;
	
	/** The street. */
	private String street;
	
	/** The landmark. */
	private String landmark;
	
	/** The postal code. */
	private String postalCode;
	
	/** The primary contact no. */
	private String primaryContactNo;
	
	/** The secondary contact no. */
	private String secondaryContactNo;
	
	/** The age. */
	private String age;
	
	/** The gender. */
	private String gender;
	
	/** The department. */
	private String department;
	
	/** The blood group. */
	private BloodGroup bloodGroup;
	
	
	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Gets the blood group.
	 *
	 * @return the blood group
	 */
	@ManyToOne(fetch=FetchType.LAZY, cascade={CascadeType.ALL})
	@JoinColumn(name="blood_group_id")
	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}
	
	/**
	 * Sets the blood group.
	 *
	 * @param bloodGroup the new blood group
	 */
	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Gets the street.
	 *
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	
	/**
	 * Sets the street.
	 *
	 * @param street the new street
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	
	/**
	 * Gets the landmark.
	 *
	 * @return the landmark
	 */
	public String getLandmark() {
		return landmark;
	}
	
	/**
	 * Sets the landmark.
	 *
	 * @param landmark the new landmark
	 */
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
	/**
	 * Gets the primary contact no.
	 *
	 * @return the primary contact no
	 */
	public String getPrimaryContactNo() {
		return primaryContactNo;
	}
	
	/**
	 * Sets the primary contact no.
	 *
	 * @param primaryContactNo the new primary contact no
	 */
	public void setPrimaryContactNo(String primaryContactNo) {
		this.primaryContactNo = primaryContactNo;
	}
	
	/**
	 * Gets the secondary contact no.
	 *
	 * @return the secondary contact no
	 */
	public String getSecondaryContactNo() {
		return secondaryContactNo;
	}
	
	/**
	 * Sets the secondary contact no.
	 *
	 * @param secondaryContactNo the new secondary contact no
	 */
	public void setSecondaryContactNo(String secondaryContactNo) {
		this.secondaryContactNo = secondaryContactNo;
	}
	
	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	
	/**
	 * Sets the age.
	 *
	 * @param age the new age
	 */
	public void setAge(String age) {
		this.age = age;
	}
	
	/**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	
	/**
	 * Sets the gender.
	 *
	 * @param gender the new gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * Gets the department.
	 *
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	
	/**
	 * Sets the department.
	 *
	 * @param department the new department
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
	/**
	 * Gets the postal code.
	 *
	 * @return the postal code
	 */
	public String getPostalCode() {
		return postalCode;
	}
	
	/**
	 * Sets the postal code.
	 *
	 * @param postalCode the new postal code
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}
