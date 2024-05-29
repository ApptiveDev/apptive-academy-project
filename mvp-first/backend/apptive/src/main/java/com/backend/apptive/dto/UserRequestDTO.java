package com.backend.apptive.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor // 모든 필드값을 파라미터로 받는 생성자 추가
@NoArgsConstructor  // 기본 생성자 추가
public class UserRequestDTO {
    private String name;
    private String phoneNumber;
}
