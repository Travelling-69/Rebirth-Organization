package com.organ.organdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.organ.organdemo.model.AdminLogin;
import com.organ.organdemo.repository.AdminLoginRepository;

@Service
public class AdminLoginServiceImpl implements AdminLoginService{
@Autowired
@Qualifier("adRepo")
private AdminLoginRepository adRepo;

@Override
public List<AdminLogin> login(String email, String password) {
	// TODO Auto-generated method stub
	return adRepo.findAllByEmailAndPassword(email, password);
}
}
