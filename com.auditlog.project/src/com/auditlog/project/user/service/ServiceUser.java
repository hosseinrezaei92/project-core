package com.auditlog.project.user.service;

import com.auditlog.project.user.UserEntity;

public class ServiceUser {

	public void save(UserEntity user) {
		System.out.println("updating user "+user.getId());
	}
	
	public void update(UserEntity user) {
		System.out.println("updating user "+user.getId());
	}
	
	public void delete(UserEntity user){
		System.out.println("deleting user "+user.getId());
	}
	
	public void get(String id){
		System.out.println("getting user "+id);
	}
}
