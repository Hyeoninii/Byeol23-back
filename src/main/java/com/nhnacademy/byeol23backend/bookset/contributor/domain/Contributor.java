package com.nhnacademy.byeol23backend.bookset.contributor.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contributors")
public class Contributor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "contributor_id")
	private Long contributorId;

	@Column(name = "contributor_name", nullable = false, length = 20)
	private String contributorName;

	@Column(name = "contributor_role", nullable = false, length = 10)
	private String contributorRole;

}
