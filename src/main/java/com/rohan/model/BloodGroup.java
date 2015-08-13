package com.rohan.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The Class BloodGroup.
 */
@Entity
@Table(name="blood_group")
public class BloodGroup extends BaseEntity{
	
	/** The name. */
	private String name;
	
	/** The blood group type. */
	private String bloodGroupType;
	
	/** The user list. */
	private Set<User> userList;
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	@Column(name="name", columnDefinition="Name of blood group like O, A, AB")
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the blood group type.
	 *
	 * @return the blood group type
	 */
	@Column(name="blood_group_type", columnDefinition="type of blood group like +ve, -ve")
	public String getBloodGroupType() {
		return bloodGroupType;
	}

	/**
	 * Sets the blood group type.
	 *
	 * @param bloodGroupType the new blood group type
	 */
	public void setBloodGroupType(String bloodGroupType) {
		this.bloodGroupType = bloodGroupType;
	}
	
	/**
	 * The Enum bloodGroupType.
	 */
	public enum bloodGroupType{
		
		/** The positive. */
		POSITIVE("+ve"),
		
		/** The negative. */
		NEGATIVE("-ve");
		
		/** The group code. */
		private String groupCode;
		
		/**
		 * Instantiates a new blood group type.
		 *
		 * @param code the code
		 */
		private bloodGroupType(String code){
			groupCode = code;
		}
		
		/**
		 * Gets the group code.
		 *
		 * @return the group code
		 */
		public String getGroupCode(){
			return groupCode;
		}
	}
	
	/**
	 * Gets the user list.
	 *
	 * @return the user list
	 */
	@OneToMany(mappedBy="BloodGroup")
	public Set<User> getUserList() {
		return userList;
	}

	/**
	 * Sets the user list.
	 *
	 * @param userList the new user list
	 */
	public void setUserList(Set<User> userList) {
		this.userList = userList;
	}
}
