package com.hibernate.hibernatedemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Student_details")//table name is Student_details
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)//auto generated id
	//taking id column
	private int id;
	@Column(length = 20, nullable = false)
	//taking name column
	private String name;
	@Column(length = 11, nullable = false, unique = true)
	//taking phone column
	private long phone;
	@Column(length = 20, nullable = false)
	//taking dept column
	private String dept;
	@Column(length = 20, nullable = false, unique = true)
	//taking email column
	private String email;
	
}
