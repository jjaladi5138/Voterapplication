 package com.example.votingapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
///META-INF/resources/webjars/bootstrap/5.1.3/css/bootstrap.min.css
///META-INF/resources/webjars/bootstrap/5.1.3/js/bootstrap.min.js
///META-INF/resources/webjars/jquery/3.6.0/jquery.min.js
import java.util.*;

@Controller

public class votercontroller {
	
	voterservice vs;
	@Autowired
	public votercontroller(voterservice vs)
	{
		this.vs = vs;
	}
	@GetMapping("/welcomepage")
	public String welcomepage()
	{ 
		  System.out.println("jaswanthjaladddddi");
		//  System.out.println(map.addAttribute("voterdetails", new voterdetails()));
		   // System.out.print("jaladdddddddd");
		    return "voterregister"; // This should match your JSP file name
		}

	
	//Instead of every time you are using Request Parameter we are using Command beam
	@PostMapping("/submit")
	//public String details(voterdetails voterdetails , ModelMap model)
	//{
	public String details(@RequestParam String name, @RequestParam String lname, @RequestParam long adharnumber) {
	    System.out.println("Received: Name - " + name + ", Last Name - " + lname + ", Adhar Number - " + adharnumber);
		 boolean b = vs.adddetails(name, lname ,adharnumber);
		 if(b)
		 {
			 return "registeredpage";	 
		 }
		 else 
		 {
			  return "errorpage";
		 }
	}
		@PostMapping("/details")
		public String voterlistdetails(ModelMap model)
		{
			List<voterdetails> l = vs. detaillist();
			System.out.println("jjjjjjhhhhd");
			model.addAttribute("l" , l);
			return "voterdetailist";
		}
		@PostMapping("/Addvoter")
		public String addvoter( )
		{
			return "redirect:welcomepage";
		}
		@GetMapping("/listdetails")
		public String listdetails(ModelMap model)
		{
			List<voterdetails> l = vs. detaillist();
			System.out.println("jjjjjjhhhhd");
			model.addAttribute("l" , l);
			return "voterdetailist";
		}
		@GetMapping("/details/{name}")
		public String listdetailsindividualperson(ModelMap model , @PathVariable String name)
		{
			Optional<voterdetails> l = vs.specificindividual(name);
			System.out.println("specificuser" + l);
			model.addAttribute("l" , l);
			return "voterdetailist";
		}
		
	
@PostMapping("/delete")
public String deletevoter(@RequestParam String name,ModelMap model)
{
	   System.out.println("jaswanth want to delete the application");
	 List<voterdetails> deletes = vs.deletelist(name);
	 System.out.println("jaswanth deleted" +deletes);
  return "redirect:listdetails";
}
@PostMapping("/update")
public String update(@RequestParam String name , ModelMap model)
{    model.put("name", name);
//System.out.println("jaladiffffffffffffffffffffffffffffff" +name);

	return "updatevoter";
}
@PostMapping("/updatedetails")
public String uuu(@RequestParam int adharnumber , @RequestParam String name ,  @RequestParam String lname)
{
	//System.out.println(name);
	//System.out.println(adharnumber);
//	System.out.println("higijoohigiu" +name);
	 List<voterdetails> update =  vs.updatelist(name , adharnumber ,lname);
	 
	 return "redirect:listdetails";
}
}