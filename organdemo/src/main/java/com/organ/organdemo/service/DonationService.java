package com.organ.organdemo.service;

import java.util.List;

import com.organ.organdemo.model.Donation;

public interface DonationService {

    	Donation insertrecord(Donation d); //POST Request

		List<Donation>getAll();  //GET Request

		void del(int di); // DEL Request

		Donation updaterecord(int i,Donation d);

}
