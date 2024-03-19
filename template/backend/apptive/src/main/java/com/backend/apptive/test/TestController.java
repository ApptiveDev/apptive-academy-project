package com.backend.apptive.test;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {
    private final TestService testService;

    @PostMapping
    public ResponseEntity<?> PostTest() {
        System.out.println("Post : /test");
        return ResponseEntity.ok(testService.addTest());
    }
    @GetMapping
    public ResponseEntity<?> GetTest() {
        System.out.println("Get : /test");
        return ResponseEntity.ok(testService.getTest());
    }
}
