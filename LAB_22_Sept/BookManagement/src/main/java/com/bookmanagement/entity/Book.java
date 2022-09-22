package com.bookmanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name="Book_details")//table name
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)//auto increment of primary key
	private int bid;
	@Column(length = 50,nullable = false,unique = true)
	private String bname;
	@Column(length = 30,nullable = false)
	private String author;
	@Column(length = 5,nullable = false)
	private int bprice;
	
}
