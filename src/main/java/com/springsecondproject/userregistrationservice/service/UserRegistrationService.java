package com.springsecondproject.userregistrationservice.service;

import com.springsecondproject.userregistrationservice.dto.UserDTO;
import com.springsecondproject.userregistrationservice.entity.UserEntity;
import com.springsecondproject.userregistrationservice.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService implements UserRegServiceImpl {
    @Autowired
    private UserRepositoryImpl userRepositoryImpl;

    //Committing...

    @Override
    public void registerValue(UserDTO userDTO) {
        UserEntity userEntity= UserEntity.builder()
                .email(userDTO.getEmail())
                .dateOfBirth(userDTO.getDateOfBirth())
                .mobileNumber(userDTO.getMobileNumber())
                .build();
        this.userRepositoryImpl.save(userEntity);

    }
}
