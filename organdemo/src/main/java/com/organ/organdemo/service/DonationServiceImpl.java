package com.organ.organdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.organ.organdemo.model.Donation;
import com.organ.organdemo.repository.DonationRepository;

@Service
public class DonationServiceImpl implements DonationService{

	@Autowired
	@Qualifier("donationRepo")
	private DonationRepository donationRepo;
	
	@Override
	public Donation insertrecord(Donation d) {
		// TODO Auto-generated method stub
		return donationRepo.save(d);
	}

	@Override
	public List<Donation> getAll() {
		// TODO Auto-generated method stub
		return donationRepo.findAll();
	}

	@Override
	public void del(int di) {
		donationRepo.deleteById(di);
		
	}

	@Override
	public Donation updaterecord(int i,Donation d) {
		Optional<Donation> opt=donationRepo.findById(i);
		if(opt.isPresent())
		{
			Donation dold=opt.get();
			dold.setFullname(d.getFullname());
			dold.setAddress(d.getAddress());
			dold.setCity(d.getCity());
			dold.setState(d.getState());
			dold.setEmail(d.getEmail());
			dold.setDateofbirth(d.getDateofbirth());
			dold.setBloodgroup(d.getBloodgroup());
			dold.setAge(d.getAge());
			dold.setGender(d.getGender());
			dold.setMedicalhistory(d.getMedicalhistory());
			dold.setConditions(d.getConditions());
			dold.setContactno(d.getContactno());
			dold.setPincode(d.getPincode());
			return donationRepo.save(dold);
		}
		return null;
	}
	
}
	
