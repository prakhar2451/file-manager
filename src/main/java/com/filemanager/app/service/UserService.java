package com.filemanager.app.service;

import com.filemanager.app.dtos.SignUpRequestDto;
import com.filemanager.app.dtos.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserDto signUp(SignUpRequestDto signUpRequestDto);
}
