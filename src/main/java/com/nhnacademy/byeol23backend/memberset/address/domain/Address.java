package com.nhnacademy.byeol23backend.memberset.address.domain;

import com.nhnacademy.byeol23backend.memberset.member.domain.Member;

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
@Table(name = "addresses")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private Long addressId;

	@Column(name = "post_code", nullable = false, length = 5)
	private String postCode;

	@Column(name = "address_info", nullable = false, length = 50)
	private String addressInfo;

	@Column(name = "address_detail", length = 30)
	private String addressDetail;

	@Column(name = "address_extra", length = 30)
	private String addressExtra;

	@Column(name = "address_alias", length = 30)
	private String addressAlias;

	@Column(name = "is_default", nullable = false)
	private Boolean isDefault;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id", nullable = false)
	private Member member;

}
