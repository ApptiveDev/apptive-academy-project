package com.backend.apptive.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserResponseDTO {
    private String status;
    private Data data;

    @Getter
    @Setter
    public static class Data {
        private String name;
        private String phoneNumber;
        private List<ASDetail> as_list;

        @Getter
        @Setter
        public static class ASDetail { // entity와 DTO를 명확히 분리하기 위해 ASDetail 엔티티를 필드로 선언 하지 않음
            private Long id;
            private String status;
            private String date;
        }
    }
}
