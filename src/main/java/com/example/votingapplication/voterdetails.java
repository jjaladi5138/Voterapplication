package com.example.votingapplication;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity

public class voterdetails {
@Id
@Column
	int id;
@Column
	String name;
@Column
	String lname;
@Column
	long adharnumber;
	public voterdetails()
	{
		
	}
	public int getId() {
		return id;
	}
	public String getname() {
		return name;
	}
	public String getlname() {
		return lname;
	}
	public long getadharnumber() {
		return adharnumber;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setlname(String lname) {
		this.lname = lname;
	}
	public void setadharnumber(long adharnumber) {
		this.adharnumber = adharnumber;
	}
	public voterdetails(int id, String firstname, String lastname, long adharnumber) {
	
		this.id = id;
		this.name = firstname;
		this.lname = lastname;
		this.adharnumber = adharnumber;
	}
	@Override
	public String toString() {
		return "voterdetails [id=" + id + ", firstname=" + name + ", lastname=" + lname + ", adharnumber="
				+ adharnumber + "]";
	}
	

}
