package com.organ.organdemo.service;

import java.util.List;

import com.organ.organdemo.model.Registration;

public interface RegistrationService {
Registration insertrecord(Registration r); //POST Request

List<Registration> getAll();  //GET Request

void del(int ri); // DEL Request

Registration updaterecord(int i,Registration r);

List<Registration>Login(String emailid,String password);



}
