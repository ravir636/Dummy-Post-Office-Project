package com.org.dummy.postoffice.service;

import java.util.List;

import com.org.dummy.postoffice.models.User;

public interface PostOfficeService {
	
	public List<User> getUserDetails();
	public User getUserDetailsByName(String name);
}
