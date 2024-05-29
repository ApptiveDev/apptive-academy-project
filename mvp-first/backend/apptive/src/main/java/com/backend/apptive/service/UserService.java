package com.backend.apptive.service;

import com.backend.apptive.domain.User;
import com.backend.apptive.dto.UserRequestDTO;
import com.backend.apptive.dto.UserResponseDTO;
import com.backend.apptive.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor // final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Transactional
@Service // 빈으로 등록
public class UserService { // 비즈니스 로직 처리

    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public UserResponseDTO getUserAS(UserRequestDTO request) {
        Optional<User> userOptional = userRepository.findByNameAndPhoneNumber(request.getName(), request.getPhoneNumber());

        if (userOptional.isPresent()) {
            User user = userOptional.get();

            UserResponseDTO response = new UserResponseDTO();
            response.setStatus("success");

            UserResponseDTO.Data data = new UserResponseDTO.Data();
            data.setName(user.getName());
            data.setPhoneNumber(user.getPhoneNumber());

            List<UserResponseDTO.Data.ASDetail> asDetails = user.getAsDetails().stream().map(asDetail -> {
                UserResponseDTO.Data.ASDetail detailDto = new UserResponseDTO.Data.ASDetail();
                detailDto.setId(asDetail.getId());
                detailDto.setStatus(asDetail.getStatus());
                detailDto.setDate(asDetail.getDate());
                return detailDto;
            }).collect(Collectors.toList());

            data.setAs_list(asDetails);
            response.setData(data);

            return response;
        }

        return null;
    }
}
