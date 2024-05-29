package com.backend.apptive.controller;

import com.backend.apptive.dto.UserRequestDTO;
import com.backend.apptive.dto.UserResponseDTO;
import com.backend.apptive.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // HTTP Response Body에 객체 데이터를 JSON 형식으로 반환하는 컨트롤러
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<UserResponseDTO> getUserAS(
            @RequestParam String name,
            @RequestParam String phoneNumber) {
        UserRequestDTO request = new UserRequestDTO();
        request.setName(name);
        request.setPhoneNumber(phoneNumber);

        UserResponseDTO response = userService.getUserAS(request);

        if (response != null) {
            return new ResponseEntity<>(response, HttpStatus.OK); // 응답 코드 200
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 응답 코드 404
        }
    }
}
