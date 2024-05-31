package com.backend.apptive.service;

import com.backend.apptive.dto.UserDto;

public interface UserService {
    public UserDto.Response findByPhoneNumber(String phoneNumber);
}
