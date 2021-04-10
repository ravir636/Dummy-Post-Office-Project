package com.org.dummy.postoffice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dummy.postoffice.dao.PostOfficeDAO;
import com.org.dummy.postoffice.models.User;
import com.org.dummy.postoffice.service.PostOfficeService;

@Service
public class PostOfficeServiceImpl implements PostOfficeService{
	
	@Autowired
	private PostOfficeDAO postOfficeDao;

	@Override
	public List<User> getUserDetails() {
		List<User> users = postOfficeDao.getUserDetails();
		return users;
	}

	@Override
	public User getUserDetailsByName(String name) {
		
		return postOfficeDao.getUserDetailsByName(name);
	}

}
