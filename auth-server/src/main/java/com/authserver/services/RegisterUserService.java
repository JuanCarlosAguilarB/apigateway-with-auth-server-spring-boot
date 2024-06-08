package com.authserver.services;

import com.authserver.models.User;
import com.authserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserService {

    /*
    1) validate that we dont have registering a user with some username or email
    2) encrypting the password of user
    3) save user

     */

    UserRepository userRepository;



    public void register (User user){

        Boolean isEmailRegistered = userRepository.existsByEmail(user.getEmail());
        Boolean isUserNameRegistered = userRepository.existsByUserName(user.getUserName());

        if (isEmailRegistered) throw new RuntimeException(" error to register user, email registered");
        if (isUserNameRegistered) throw new RuntimeException(" error to register user, username registered");

        userRepository.save(user);
    }

    public RegisterUserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

}

