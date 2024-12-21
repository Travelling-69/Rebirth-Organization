package com.organ.organdemo.service;

import java.util.List;

import com.organ.organdemo.model.AdminLogin;

public interface AdminLoginService {
List<AdminLogin>login (String email,String password);
}
