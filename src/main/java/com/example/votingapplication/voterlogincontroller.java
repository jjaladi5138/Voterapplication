package com.example.votingapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class voterlogincontroller {
	 @Autowired
	 voterlogindetailsservice vs;
	 
	  @GetMapping("/Register")
	  public String register()
	  {
		  System.out.println("please help me");
		  return "logindetails";
	  }
	  @PostMapping("/submitdetails")
	  public voterlogindetails submitdetails(@RequestParam String username , @RequestParam String password , @RequestParam String role )
	  {
		  System.out.println("kkkkk");
		   return vs.savedetails(username , password , role);
	  }
	 

}
