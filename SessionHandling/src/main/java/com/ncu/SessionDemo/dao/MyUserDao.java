package com.ncu.SessionDemo.dao;
import java.util.List;


import com.ncu.SessionDemo.model.SessionUsers;



public interface MyUserDao {

	   public void saveOrUpdate(SessionUsers user);
	     
	    public void delete(String email);
	     
	    public  SessionUsers get(String email);
	     
	    public List<SessionUsers> list();
}
