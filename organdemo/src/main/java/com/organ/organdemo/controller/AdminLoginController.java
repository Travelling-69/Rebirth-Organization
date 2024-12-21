package com.organ.organdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organ.organdemo.model.AdminLogin;
import com.organ.organdemo.service.AdminLoginService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/admin/")
public class AdminLoginController {
@Autowired
AdminLoginService adserv;
@GetMapping("/login/{email}/{password}")
public List<AdminLogin> login(@PathVariable("email")String email,@PathVariable("password")String password)
{
	return adserv.login(email, password);
}
}
