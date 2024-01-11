package com.example.votingapplication;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;



@Service
public class configurationsdetails  implements UserDetailsService {
@Autowired 
 voterlogindetails details;
voterlogindatajpa lp;

@Override
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	String username1  , password= null; 
	List<GrantedAuthority> a = null;
	 System.out.println(username + "jjjjjjjj");
	List<voterlogindetails> x =  lp.findByUsername(username);
	System.out.println(x+ "userrrrrrrrrrrrrrrrrr");
	if(x.size() ==0)
	{
		System.out.println("please");
	}
	else
	{
		  details = x.get(0);

	 username1 = details.getUsername();
	 password = details.getPassword();
	 String pp = passwordEncoder().encode(password);
	 a = new ArrayList<>();
	  a.add(new SimpleGrantedAuthority(details.getRole()));
	 System.out.println(username1 + "ddd" + pp + "dddd"+ a);
	 return new User(username  , pp , a);
	}
	
return new User(null , null , null);
}

private BCryptPasswordEncoder passwordEncoder() {
	
	   return new BCryptPasswordEncoder();
}

}
