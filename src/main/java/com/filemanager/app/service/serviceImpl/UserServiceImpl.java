package com.filemanager.app.service.serviceImpl;

import com.filemanager.app.dtos.SignUpRequestDto;
import com.filemanager.app.dtos.UserDto;
import com.filemanager.app.repository.UserRepo;
import com.filemanager.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    private PasswordEncoder passwordEncoder;

    @Override
    public UserDto signUp(SignUpRequestDto signUpRequestDto) {
        return null;
    }
}
