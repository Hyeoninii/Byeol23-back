package com.nhnacademy.byeol23backend.bookset.book.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.nhnacademy.byeol23backend.bookset.publisher.domain.Publisher;

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
@Table(name = "books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private Long bookId;

	@Column(name = "book_name", length = 200, nullable = false)
	private String bookName;

	@Column(name = "contents")
	private String contents;

	@Column(name = "description")
	private String description;

	@Column(name = "regular_price", nullable = false, precision = 10)
	private BigDecimal regularPrice;

	@Column(name = "sale_price", nullable = false, precision = 10)
	private BigDecimal salePrice;

	@Column(name = "isbn", nullable = false, length = 13, unique = true)
	private String isbn;

	private LocalDate publishDate;

	@Column(name = "is_pack", nullable = false)
	private boolean isPack;

	@Column(name = "book_status", nullable = false, length = 10)
	private String bookStatus;

	@Column(name = "stock", nullable = false)
	private Integer stock;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "publisher_id", nullable = false)
	private Publisher publisher;

	@Column(name = "book_img", nullable = false)
	private String bookImg;

}