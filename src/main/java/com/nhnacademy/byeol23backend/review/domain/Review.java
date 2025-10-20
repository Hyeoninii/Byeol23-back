package com.nhnacademy.byeol23backend.review.domain;

import com.nhnacademy.byeol23backend.memberset.member.domain.Member;
import com.nhnacademy.byeol23backend.orderset.orderdetail.domain.OrderDetail;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @Column(name = "review_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @Column(name = "review_rate")
    private Integer reviewRate;

    @Column(name = "review_content")
    private String reviewContent;

    @Column(name = "review_image")
    private String reviewImage;

    private LocalDateTime createdAt;

    private LocalDateTime revisedAt;

    @JoinColumn(name = "member_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @JoinColumn(name = "order_details_id", nullable = false)
    @OneToOne(fetch = FetchType.LAZY)
    private OrderDetail orderDetail;

}
