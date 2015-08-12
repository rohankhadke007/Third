package com.rohan.dao;

import java.util.List;

import com.rohan.model.*;
public interface UserDao {
	
	List<User> getUserByBloodGroup(Long bloodGroupId);
	
	User getUserByUserFirstName(String firstName);
}
