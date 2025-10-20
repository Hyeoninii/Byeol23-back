package com.nhnacademy.byeol23backend.orderset.order.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.nhnacademy.byeol23backend.couponset.coupon.domain.Coupon;
import com.nhnacademy.byeol23backend.memberset.member.domain.Member;
import com.nhnacademy.byeol23backend.orderset.delivery.domain.DeliveryPolicy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private Long orderId;

	@Column(name = "order_number", nullable = false, length = 17)
	private String orderNumber;

	@Column(name = "order_password")
	private String orderPassword;

	@Column(name = "total_book_price", nullable = false, precision = 10)
	private BigDecimal totalBookPrice;

	@Column(name = "actual_order_price", nullable = false, precision = 10)
	private BigDecimal actualOrderPrice;

	private LocalDateTime orderDate;

	@Column(name = "order_status", nullable = false, length = 10)
	private String orderStatus;

	private LocalDate deliverySentAt;

	private LocalDate deliveryArrivedAt;

	private LocalDate deliveryDesiredAt;

	@Column(name = "delivery_number", nullable = false, length = 11)
	private String deliveryNumber;

	@Column(name = "receiver", nullable = false, length = 10)
	private String receiver;

	@Column(name = "receiver_address", nullable = false, length = 30)
	private String receiverAddress;

	@Column(name = "receiver_address_detail", nullable = false, length = 10)
	private String receiverAddressDetail;

	@Column(name = "receiver_phone", nullable = false, length = 11)
	private String receiverPhone;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id")
	private Member member;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "delivery_policy_id", nullable = false)
	private DeliveryPolicy deliveryPolicy;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "coupon_id")
	private Coupon coupon;

}
