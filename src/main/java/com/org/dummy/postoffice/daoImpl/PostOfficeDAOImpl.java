package com.org.dummy.postoffice.daoImpl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import com.org.dummy.postoffice.dao.PostOfficeDAO;
import com.org.dummy.postoffice.models.Address;
import com.org.dummy.postoffice.models.User;


/**
 * 
 * @author RAVI
 *
 */
@Repository
public class PostOfficeDAOImpl implements PostOfficeDAO{
	
	private List<User> getUsersDetail() {
		List<User> list = new ArrayList<>();
		User user1 = new User();
		user1.setName("RAVI");
		user1.setLastName("RAHANGDALE");
		user1.setNumber("132343242");
		Address address = new Address();
		address.setFlatNo(1);
		address.setAreaName("wakad");
		address.setCityName("pune");
		address.setLandmark("wakad bridge");
		address.setPinCode(411057);
		user1.setAddress(address);
		
		User user2 = new User();
		user2.setName("RAVI2");
		user2.setLastName("RAHANGDALE");
		user2.setNumber("132343242");
		Address address1 = new Address();
		address1.setFlatNo(2);
		address1.setAreaName("wakad");
		address1.setCityName("pune");
		address1.setLandmark("wakad bridge");
		address1.setPinCode(411057);
		user2.setAddress(address1);
		
		User user3 = new User();
		user3.setName("RAVI3");
		user3.setLastName("RAHANGDALE");
		user3.setNumber("132343242");
		Address address3 = new Address();
		address3.setFlatNo(3);
		address3.setAreaName("wakad");
		address3.setCityName("pune");
		address3.setLandmark("wakad bridge");
		address3.setPinCode(411057);
		user3.setAddress(address3);
		
		list.add(user1);
		list.add(user2);
		list.add(user3);
		return list;
	}

	@Override
	public List<User> getUserDetails() {
		//list of users
		
		return getUsersDetail();
	}

	@Override
	public User getUserDetailsByName(String name) {
		List<User> users = getUsersDetail();
		User userData = new User();
		boolean flag = false;
		for(User user : users){
			if (user.getName().equals(name)){
				flag = true;
				userData.setName(user.getName());
				userData.setLastName(user.getLastName());
				userData.setNumber(user.getNumber());
				userData.setAddress(user.getAddress());
			}
		}
		if(flag){
			return userData;
		}
		else
		return new User();	
		
	}

}
