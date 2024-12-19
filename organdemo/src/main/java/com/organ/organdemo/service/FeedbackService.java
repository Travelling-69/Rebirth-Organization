package com.organ.organdemo.service;

import java.util.List;

import com.organ.organdemo.model.Feedback;
import com.organ.organdemo.model.Registration;

public interface FeedbackService {
	
	Feedback insertrecord(Feedback f); //POST Request

	List<Feedback> getAll();  //GET Request

	void del(int ri); // DEL Request
	
	Feedback updaterecord(int i, Feedback f); // update Request

}
