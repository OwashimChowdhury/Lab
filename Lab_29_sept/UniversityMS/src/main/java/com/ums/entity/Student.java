package com.ums.entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
//creating student table
public class Student {
	//attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int s_rollno;
	@Column(length = 30,nullable = false)
	private String sname;
	@Column(length = 20,nullable = false)
	private String sdept;
	@Column(length = 20,nullable = false)
	private String saddress;
	@Column(length = 20,nullable = false)
	private String email;
	@Column(length = 12,nullable = false)
	private long scontact;
	
	@ManyToOne(targetEntity = University.class,cascade = CascadeType.ALL)
	private University university;
}
