package com.organ.organdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Enquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int enid;
	private int age,pincode;
	private String organname,bloodgroup,dist,city,conatctno,medhistroy,location,termsandcondition;
	public Enquiry() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Enquiry(int age, int pincode,String organname, String bloodgroup, String dist, String city,
			String conatctno, String medhistroy, String location, String termsandcondition) {
		super();
		this.age = age;
		this.pincode = pincode;
		this.organname = organname;
		this.bloodgroup = bloodgroup;
		this.dist = dist;
		this.city = city;
		this.conatctno = conatctno;
		this.medhistroy = medhistroy;
		this.location = location;
		this.termsandcondition = termsandcondition;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getOrganname() {
		return organname;
	}
	public void setOrganname(String organname) {
		this.organname = organname;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getConatctno() {
		return conatctno;
	}
	public void setConatctno(String conatctno) {
		this.conatctno = conatctno;
	}
	public String getMedhistroy() {
		return medhistroy;
	}
	public void setMedhistroy(String medhistroy) {
		this.medhistroy = medhistroy;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTermsandcondition() {
		return termsandcondition;
	}
	public void setTermsandcondition(String termsandcondition) {
		this.termsandcondition = termsandcondition;
	}
	@Override
	public String toString() {
		return "Enquiry [age=" + age + ", pincode=" + pincode + ", organname=" + organname + ", bloodgroup="
				+ bloodgroup + ", dist=" + dist + ", city=" + city + ", conatctno=" + conatctno + ", medhistroy="
				+ medhistroy + ", location=" + location + ", termsandcondition=" + termsandcondition + "]";
	}
	
}

	


