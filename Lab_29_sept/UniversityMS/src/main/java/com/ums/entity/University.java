package com.ums.entity;

import java.util.List;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
//creating university table
public class University {
//attributes
	@Id
	private int uid;
	@Column(length = 30,nullable = false)
	private String uname;
	@Column(length = 15,nullable = false)
	private String ulocation;
	@Column(length = 15,nullable = false)
	private String uhead;
	@Column(length = 25,nullable = false)
	private String uemail;
	
	@OneToMany(targetEntity = Student.class,cascade = CascadeType.ALL)
	@JoinColumn(name="uid")
	private List<Student> student;
}
