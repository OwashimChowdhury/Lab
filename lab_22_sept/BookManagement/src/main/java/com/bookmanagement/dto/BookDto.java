package com.bookmanagement.dto;


import javax.validation.constraints.NotNull;

import jakarta.persistence.Column;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class BookDto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid;
	@Column(length = 50,nullable = false)
	@NotNull(message = "please enter name")
	private String bname;
	@Column(length = 30,nullable = false)
	@NotNull(message = "please enter Author name")
	private String author;
	@Column(length = 5,nullable = false)
	@NotNull(message = "please enter price")
	private int bprice;
	
}