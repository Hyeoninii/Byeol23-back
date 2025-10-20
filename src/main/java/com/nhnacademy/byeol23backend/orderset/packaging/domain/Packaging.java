package com.nhnacademy.byeol23backend.orderset.packaging.domain;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "packaging")
public class Packaging {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "packaging_id")
	private Long packagingId;

	@Column(name = "packaging_name", nullable = false, length = 30)
	private String packagingName;

	@Column(name = "packaging_img", nullable = false)
	private String packagingImg;

	@Column(name = "packaging_price", nullable = false, precision = 10)
	private BigDecimal packagingPrice;
}
