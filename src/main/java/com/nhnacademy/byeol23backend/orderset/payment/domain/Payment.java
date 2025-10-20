package com.nhnacademy.byeol23backend.orderset.payment.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.nhnacademy.byeol23backend.orderset.order.domain.Order;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "payments")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "payment_id")
	private Long paymentId;

	@Column(name = "payment_key", nullable = false, length = 200)
	private String paymentKey;

	@Column(name = "order_name", nullable = false, length = 100)
	private String orderName;

	@Column(name = "payment_method", nullable = false, length = 10)
	private String paymentMethod;

	@Column(name = "total_price", nullable = false, precision = 10)
	private BigDecimal totalPrice;

	private LocalDateTime paymentRequestAt;

	private LocalDateTime paymentApprovedAt;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id", nullable = false)
	private Order order;
}
