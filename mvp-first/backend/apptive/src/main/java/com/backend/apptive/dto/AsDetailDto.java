package com.backend.apptive.dto;

import com.backend.apptive.domain.AsDetail;
import com.backend.apptive.domain.User;
import lombok.Builder;
import lombok.Getter;

public class AsDetailDto {
    @Builder
    @Getter
    public static class Request{
        private String phoneNumber;
        private String status;
        private String date;

        public AsDetail toEntity(User user) {
            return AsDetail.builder()
                    .user(user)
                    .status(status)
                    .date(date)
                    .build();
        }
    }

    @Builder
    @Getter
    public static class Response {
        private Long id;
        private String status;
        private String date;

        public static AsDetailDto.Response toDto(AsDetail asDetail) {
            return Response.builder()
                    .id(asDetail.getId())
                    .status(asDetail.getStatus())
                    .date(asDetail.getDate())
                    .build();
        }
    }
}
