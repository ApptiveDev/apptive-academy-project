package com.backend.apptive.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class AsDetail {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "date", nullable = false)
    private String date;

    // 지연 로딩 설정
    @ManyToOne(fetch = FetchType.LAZY)
    // 3 JoinColumn 변경 완료
    @JoinColumn(name = "user_id")
    private User user;

    @Builder
    public AsDetail(User user, String status, String date) {
        this.user = user;
        this.status = status;
        this.date = date;
    }

    // 연관관계 매핑 편의 메소드 **
    public void makeRelation(User user){
        this.user = user;
        user.getAsDetailList().add(this);
    }
}
