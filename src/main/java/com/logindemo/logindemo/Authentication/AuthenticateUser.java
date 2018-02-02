package com.logindemo.logindemo.Authentication;

import com.logindemo.logindemo.Entity.Login;
import com.logindemo.logindemo.Repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthenticateUser {

    @Autowired
    LoginRepository loginRepository;

    public Login validateUser(String username, String password) {
        Login user = loginRepository.findByUserName(username);
        if (password.equals(user.getPassword()))
            return user;
        return null;
    }
}
