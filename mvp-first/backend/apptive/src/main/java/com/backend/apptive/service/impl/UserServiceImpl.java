package com.backend.apptive.service.impl;

import com.backend.apptive.domain.User;
import com.backend.apptive.dto.AsDetailDto;
import com.backend.apptive.dto.UserDto;
import com.backend.apptive.reposritory.UserRepository;
import com.backend.apptive.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    public UserDto.Response findByPhoneNumber(String phoneNumber){
        User user = userRepository.findByPhoneNumber(phoneNumber)
                .orElseThrow(() -> new EntityNotFoundException("유저를 찾을 수 없습니다: " + phoneNumber));

        List<AsDetailDto.Response> as_list = user.getAsDetailList()
                .stream()
                .map(AsDetailDto.Response::toDto)
                .collect(Collectors.toList());

        return UserDto.Response.toDto(user, as_list);
    }
}
