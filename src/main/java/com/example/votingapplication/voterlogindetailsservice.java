package com.example.votingapplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class voterlogindetailsservice {
	@Autowired
	voterlogindatajpa vldj;
	
	
	public voterlogindetails savedetails(String username , String password , String role)
	{
	  voterlogindetails vld  = new voterlogindetails(0, username , password , role);
	  return vldj.save(vld);
	}
	
	

}
