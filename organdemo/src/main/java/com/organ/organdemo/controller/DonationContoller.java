package com.organ.organdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.organ.organdemo.model.Donation;
import com.organ.organdemo.service.DonationService;

@RestController
public class DonationContoller {
	@Autowired

	private DonationService ds;
	
	@GetMapping("/Donations")
	public List<Donation> handleget()
	{
		return ds.getAll();	
	}
	@PostMapping("/adddon") 
	public Donation add(@RequestBody Donation d)
	{
		return ds.insertrecord(d);	
	}

	@DeleteMapping("/deldon/{did}")
	public void deld(@PathVariable("did")int d)
	{
		ds.del(d);
	}
	@PutMapping("/updon/{did}")
	public Donation update(@PathVariable ("did")int di, @RequestBody Donation d)
	{
		return ds.updaterecord(di,d);
	}
	
}

