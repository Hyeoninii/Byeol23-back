package com.nhnacademy.byeol23backend.bookset.category.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private Long categoryId;

	@Column(name = "category_name", nullable = false, length = 50)
	private String categoryName;

	/**
	 * 자식(Many) 입장에서 부모(One)를 참조합니다.
	 * 이것이 연관관계의 주인이 되며, DB의 parent_id FK를 관리합니다.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id") // DB 외래키 컬럼명
	private Category parent;

	/**
	 * 부모(One) 입장에서 자식(Many) 목록을 참조합니다.
	 * 'mappedBy = "parent"'는 이 관계가 "parent" 필드에 의해 매핑되었음을 의미합니다.
	 * (읽기 전용, 연관관계의 주인이 아님)
	 */
	@OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Category> children = new ArrayList<>();

}
