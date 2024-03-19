package com.backend.apptive.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;

    @Transactional
    public String addTest() {
        TestEntity test = TestEntity.builder().name("test").build();
        testRepository.save(test);
        return "Test 성공";
    }

    @Transactional
    public String getTest() {
        List<TestEntity> all = testRepository.findAll();
        if(all.isEmpty()) return "빈 데이터베이스";
        else return "Test 성공";
    }
}
