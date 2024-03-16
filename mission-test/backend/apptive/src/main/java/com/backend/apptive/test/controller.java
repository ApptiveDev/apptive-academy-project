package com.backend.apptive.test;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class controller {
    private final service service1;

    @PostMapping
    public ResponseEntity<?> stylistFilter() {
        System.out.println("test1");
        service1.add();
        return ResponseEntity.ok("성공");
    }
    @GetMapping
    public ResponseEntity<?> stylistFilter1() {
        System.out.println("test2");
        return ResponseEntity.ok("성공");
    }
}
