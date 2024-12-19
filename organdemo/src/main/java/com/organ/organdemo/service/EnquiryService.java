package com.organ.organdemo.service;

import java.util.List;


import com.organ.organdemo.model.Enquiry;

public interface EnquiryService {
	
	Enquiry insertrecord(Enquiry e); //POST Request

	List<Enquiry>getAll();  //GET Request

	void del(int ei); // DEL Request

	Enquiry updaterecord(int i,Enquiry e);

}
