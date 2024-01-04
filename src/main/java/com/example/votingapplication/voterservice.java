package com.example.votingapplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class voterservice {
	voterdetails vds;
	voterdatabase vdatabase;
	@Autowired
	public voterservice(voterdetails vds , voterdatabase vdatabase)
	{
		this.vds = vds;
		this.vdatabase = vdatabase;
	}
	 static int  count =0;
	 List<voterdetails> vd = new ArrayList<>();
     public boolean  adddetails(String name , String lname , long adharcard)
     {
    	 voterdetails vdetail = new voterdetails(count++, name, lname, adharcard);
         vd.add(vdetail);
         vdatabase.save(vdetail);
         return true;
     }
     public List<voterdetails> detaillist()
     {
    	 System.out.println(vd);
    	 return vd;
     }
     public List<voterdetails> specificlist(String name)
     {
    	  vd.stream().filter(vds->vds.getlname().equals(name));
    	  return vd;
     }
     public List<voterdetails> deletelist(String name)
     {
    	   vd.removeIf(voter -> voter.getname().equals(name));
    	   
    	   return vd;
     }
     public List<voterdetails> updatelist(String name , int adharnumber , String lname)
     {
    	 vd.stream().filter(vds->vds.getname().equals(name)).forEach(vd->
    	 {vd.setadharnumber(adharnumber) ;
    	 vd.setlname(lname); });
    	 System.out.println(vd);
    	 return vd;
     }
     public Optional<voterdetails> specificindividual(String name) {
    	    Optional<voterdetails> result = vd.stream()
    	                                      .filter(vds -> vds.getlname().equals(name))
    	                                      .findFirst();

    	    result.ifPresent(voter -> System.out.println("Found: " + voter.getname())); // Print the name if found
    	    return result;
    	}
     
}
