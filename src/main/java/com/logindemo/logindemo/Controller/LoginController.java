package com.logindemo.logindemo.Controller;


import com.logindemo.logindemo.Entity.Userdata;
import com.logindemo.logindemo.Service.LoginService;
import com.logindemo.logindemo.model.LoginModel;
import com.logindemo.logindemo.model.UserDataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/getuserdata")
public class LoginController {
    @Autowired
    LoginService loginService;
    @RequestMapping(method = RequestMethod.POST)
    public UserDataDto getUsers(@RequestBody LoginModel loginModel) {
        return loginService.fetchUserData(loginModel);
    }
}


