package com.backend.apptive.dto;

import com.backend.apptive.domain.User;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

public class UserDto {
    @Builder
    @Getter
    public static class Request {
        private String name;
        private String phoneNumber;

        public User toEntity() {
            return User.builder()
                    .name(name)
                    .phoneNumber(phoneNumber)
                    .build();
        }
    }
    @Builder
    @Getter
    public static class Response {
        private String name;
        private String phoneNumber;
        private List<AsDetailDto.Response> as_list;

        public static UserDto.Response toDto(User user, List<AsDetailDto.Response> as_list) {
            return Response.builder()
                    .name(user.getName())
                    .phoneNumber(user.getPhoneNumber())
                    .as_list(as_list)
                    .build();
        }
    }
}
