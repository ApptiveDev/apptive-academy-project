package com.backend.apptive.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class service {

    private final testR testr;

    @Transactional
    public void add() {
        test test = com.backend.apptive.test.test.builder().name("test").build();
        testr.save(test);
        return ;
    }
}
