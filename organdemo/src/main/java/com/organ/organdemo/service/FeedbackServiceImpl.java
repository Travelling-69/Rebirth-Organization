package com.organ.organdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.organ.organdemo.model.Feedback;
import com.organ.organdemo.repository.FeedbackRepository;

@Service
public class FeedbackServiceImpl implements FeedbackService{
	
	@Autowired
	@Qualifier("feedRepo")
	private FeedbackRepository feedRepo;

	@Override
	public Feedback insertrecord(Feedback f) {
		// TODO Auto-generated method stub
		return feedRepo.save(f);
	}

	@Override
	public List<Feedback> getAll() {
		// TODO Auto-generated method stub
		return feedRepo.findAll();
	}

	@Override
	public void del(int ri) {
		feedRepo.deleteById(ri);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Feedback updaterecord(int i,Feedback f) {
		Optional<Feedback> opt=feedRepo.findById(i);
		if(opt.isPresent())
		{
			Feedback rold=opt.get();
			rold.setEmailid(f.getEmailid());
			rold.setMessage(f.getMessage());
			return feedRepo.save(rold);
		}
		return null;
	}
	}
	
