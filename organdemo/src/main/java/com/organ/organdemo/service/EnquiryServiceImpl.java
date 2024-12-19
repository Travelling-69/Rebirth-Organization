package com.organ.organdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.organ.organdemo.model.Enquiry;
import com.organ.organdemo.repository.EnquiryRepository;

@Service
public class EnquiryServiceImpl implements EnquiryService {
	
	@Autowired
	@Qualifier("enRepo")
	private EnquiryRepository enRepo;

	@Override
	public Enquiry insertrecord(Enquiry e) {
		// TODO Auto-generated method stub
		return enRepo.save(e);
	}
	
	@Override
	public List<Enquiry> getAll() {
		// TODO Auto-generated method stub
		return enRepo.findAll();
	}

	@Override
	public void del(int ei) {
		// TODO Auto-generated method stub
		enRepo.deleteById(ei);
	}

	@Override
	public Enquiry updaterecord(int i,Enquiry e) {
		Optional<Enquiry> opt=enRepo.findById(i);
		if(opt.isPresent())
		{
			Enquiry eold = opt.get();
			eold.setOrganname(e.getOrganname());
			eold.setBloodgroup(e.getBloodgroup());
			eold.setLocation(e.getLocation());
			eold.setAge(e.getAge());
			eold.setTermsandcondition(e.getTermsandcondition());
			eold.setMedhistroy(e.getMedhistroy());
			eold.setConatctno(e.getConatctno());
			eold.setDist(e.getDist());
			eold.setCity(e.getCity());
			eold.setPincode(e.getPincode());
		}
		return null;
	}
	
}




