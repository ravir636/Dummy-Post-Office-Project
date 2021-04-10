package com.org.dummy.postoffice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.dummy.postoffice.models.User;
import com.org.dummy.postoffice.service.PostOfficeService;

@RestController
@RequestMapping(value="/postoffice", produces= MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class PostOfficeController {

	@Autowired
	private PostOfficeService postOfficeService;
	
	@RequestMapping(value="/getTrackingIDs", method=RequestMethod.GET)
	public List<String> trackingId()
	{
		List<String> list = new ArrayList<>();
		list.add("123");
		list.add("345");
		list.add("567");
		return list;
	}
	
	@RequestMapping(value="/getUserDetails", method=RequestMethod.GET)
	public List<User> getUserDetails(){
		return postOfficeService.getUserDetails();
	}
	
	@RequestMapping(value="/getUserDetail/{name}", method=RequestMethod.GET)
	public User getUserDetailsByName(@PathVariable("name") String name){
		String userName = name.toUpperCase();
		return postOfficeService.getUserDetailsByName(userName);
	}
}
