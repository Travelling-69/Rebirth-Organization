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

import com.organ.organdemo.model.Enquiry;
import com.organ.organdemo.service.EnquiryService;


@RestController
public class EnquiryController{
@Autowired

private EnquiryService es;
@GetMapping("/enquiry")
 
public List<Enquiry> handleget()
{
	return es.getAll();	
}
@PostMapping("/adden") 
public Enquiry add(@RequestBody Enquiry e)
{  
	return es.insertrecord(e);	
}

@DeleteMapping("/delen/{enid}")

public void del(@PathVariable("enid")int e)
{
	es.del(e);
}
@PutMapping("/upen/{enid}")
public Enquiry update(@PathVariable ("enid")int i, @RequestBody Enquiry e)
{
	return es.updaterecord(i, e);
}


}






