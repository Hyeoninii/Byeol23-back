package com.nhnacademy.byeol23backend.orderset.refundpolicy.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "refund_policy")
public class RefundPolicy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "refund_policy_id")
	private Long refundPolicyId;

	@Column(name = "refund_policy_name", nullable = false, length = 30)
	private String refundPolicyName;

	@Column(name = "refund_condition", nullable = false, length = 20)
	private String refundCondition;

	@Column(name = "comment", nullable = false)
	private String comment;

	private LocalDateTime changedAt;

	@Column(name = "is_active", nullable = false)
	private Boolean isActive;
}
