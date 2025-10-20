package com.nhnacademy.byeol23backend.orderset.refund.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "refunds")
public class Refund {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "refund_id")
	private Long refundId;

	private LocalDateTime refundAt;

	@Column(name = "refund_reason", nullable = false, length = 100)
	private String refundReason;

	@Column(name = "refund_quantity", nullable = false)
	private Integer refundQuantity;

	@Column(name = "refund_price", nullable = false, precision = 10)
	private BigDecimal refundPrice;

	@Column(name = "refund_fee", nullable = false, precision = 10)
	private BigDecimal refundFee;

}
