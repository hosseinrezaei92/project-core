package com.auditlog.project.mainTest;

import com.auditlog.project.user.UserEntity;
import com.auditlog.project.user.service.ServiceUser;

public class MainTest {

	public static void main(String[] args) {
		
		MainTest mainTest = new MainTest();
		UserEntity user = mainTest.createUser();
		ServiceUser service = new ServiceUser();
		service.save(user);
	}
	
	private UserEntity createUser() {
		UserEntity user = new UserEntity();
		user.setId("123asd");
		user.setName("hossein");
		user.setFamily("rezaei");
		return user;
	}
}
