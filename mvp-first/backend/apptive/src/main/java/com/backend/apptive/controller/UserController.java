package com.backend.apptive.controller;

import com.backend.apptive.dto.UserDto;
import com.backend.apptive.service.UserService;
import com.backend.apptive.utils.ApiUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("api/user")
    public ResponseEntity<?> findUser(@RequestBody UserDto.Request request) {
        return ResponseEntity.ok(ApiUtils.success(userService.findByPhoneNumber(request.getPhoneNumber())));
    }
}
