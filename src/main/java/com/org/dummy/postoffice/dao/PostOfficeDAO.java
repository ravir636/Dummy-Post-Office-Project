package com.org.dummy.postoffice.dao;

import java.util.List;

import com.org.dummy.postoffice.models.User;

public interface PostOfficeDAO {
	
	public List<User> getUserDetails();
	public User getUserDetailsByName(String name);

}
