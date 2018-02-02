package com.logindemo.logindemo.Service;

import com.logindemo.logindemo.Authentication.AuthenticateUser;
import com.logindemo.logindemo.Entity.Login;
import com.logindemo.logindemo.Entity.Userdata;
import com.logindemo.logindemo.Repository.UserdataRepository;
import com.logindemo.logindemo.model.LoginModel;
import com.logindemo.logindemo.model.UserDataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class LoginService {
    @Autowired
    UserdataRepository userdataRepository;
    @Autowired
    AuthenticateUser authenticateUser;
    public UserDataDto fetchUserData(LoginModel loginModel)
    {

         Login login = authenticateUser.validateUser(loginModel.getUsername(),loginModel.getPassword());
        if(login==null)
        {
            return null;
        }
        Userdata entity =  userdataRepository.findByLogin(login.getId());
        UserDataDto  userDataDto = new UserDataDto();
        userDataDto.setEmpid(entity.getEmpid());
        userDataDto.setFirstname(entity.getFirstname());
        userDataDto.setLastname(entity.getLastname());
        userDataDto.setId(entity.getId());
        return userDataDto;
    }
}
