package com.organ.organdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Donation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int donid;
	private int dateofbirth,age,pincode;
	private String fullname,gender,city,state,email,address,contactno,bloodgroup,medicalhistory,conditions;
	public Donation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Donation(int dateofbirth, String fullname, String gender, String city, String state, String email,
			String address, String contactno,int age,String bloodgroup,String medicalhistory,int pincode,String conditions) {
		super();
		this.dateofbirth = dateofbirth;
		this.age = age;
		this.pincode = pincode;
		this.fullname = fullname;
		this.gender = gender;
		this.city = city;
		this.state = state;
		this.email = email;
		this.address = address;
		this.contactno = contactno;
		this.bloodgroup = bloodgroup;
		this.medicalhistory = medicalhistory;
		this.conditions = conditions;

	}
	
	public int getDonid() {
		return donid;
	}

	public void setDonid(int donid) {
		this.donid = donid;
	}

	public int getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(int dateofbirth) {
		this.dateofbirth = dateofbirth;
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

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getMedicalhistory() {
		return medicalhistory;
	}

	public void setMedicalhistory(String medicalhistory) {
		this.medicalhistory = medicalhistory;
	}

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	@Override
	public String toString() {
		return "Donation [donid=" + donid + ", dateofbirth=" + dateofbirth + ", age=" + age + ", pincode=" + pincode
				+ ", fullname=" + fullname + ", gender=" + gender + ", city=" + city + ", state=" + state + ", email="
				+ email + ", address=" + address + ", contactno=" + contactno + ", bloodgroup=" + bloodgroup
				+ ", medicalhistory=" + medicalhistory + ", conditions=" + conditions + "]";
	}
	
}
	
	