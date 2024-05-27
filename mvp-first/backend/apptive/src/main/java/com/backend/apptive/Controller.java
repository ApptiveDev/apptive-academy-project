package com.backend.apptive;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Controller {

    public List<Map<String, Object>> dataList = new ArrayList<>();

    // 초기 데이터 설정 (예제용)
    public Controller() {
        Map<String, Object> data1 = new HashMap<>();
        data1.put("name", "앱티브");
        data1.put("phoneNumber", "010-0000-0000");

        List<Map<String, String>> asList1 = new ArrayList<>();
        Map<String, String> as1 = new HashMap<>();
        as1.put("id", "123");
        as1.put("status", "완료");
        as1.put("date", "2023-05-20");
        asList1.add(as1);
        data1.put("as_list", asList1);

        dataList.add(data1);
    }

    @GetMapping("/api/user")
    public ResponseEntity<Map<String, Object>> getData(@RequestBody Map<String, String> request) {
        String name = request.get("name");
        String phoneNumber = request.get("phoneNumber");
        // 요청으로 들어온 이름과 전번을

        for (Map<String, Object> data : dataList) {
            if (name.equals(data.get("name")) && phoneNumber.equals(data.get("phoneNumber"))) {
                // List 내 데이터들과 매칭되는게 있으면 해당 객체를 리턴
                Map<String, Object> response = new HashMap<>();
                response.put("status", "success");
                response.put("data", data);
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}