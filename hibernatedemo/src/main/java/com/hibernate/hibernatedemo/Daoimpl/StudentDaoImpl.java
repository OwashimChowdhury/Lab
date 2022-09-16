package com.hibernate.hibernatedemo.Daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.hibernatedemo.config.HibernateUtil;
import com.hibernate.hibernatedemo.dao.StudentDao;
import com.hibernate.hibernatedemo.entity.Student;

public class StudentDaoImpl implements StudentDao {
	//this method will add new student 
	public void addStudent() {
		Scanner sc = new Scanner(System.in);
		String n,d,e;
		long p;
		//taking input from use and store it
		System.out.println("Enter name: ");
		n = sc.nextLine();
		System.out.println("Enter Dept: ");
		d = sc.nextLine();
		System.out.println("Enter email: ");
		e = sc.nextLine();
		System.out.println("Enter phone: ");
		p = sc.nextLong();
		
		Student s = new Student();
		//set the values
		s.setName(n);
		s.setDept(d);
		s.setEmail(e);
		s.setPhone(p);
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(s);//save to db table
		t.commit();
	}
	//this method is to update phone no.
	public void updateStudent() {
		Scanner sc = new Scanner(System.in);
		//taking value
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Student std=session.get(Student.class, id);
		System.out.println("enter phone: ");
		long phone=sc.nextLong();
		std.setPhone(phone);
		session.update(std);//update phone no.
		t.commit();
	}
	//this method to delete row
	public void deleteStudent() { 
		Scanner sc = new Scanner(System.in);
		//taking value
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		
		Student std1 = session.get(Student.class, id);
		session.delete(std1);//deleting row
		System.out.println("Deleted Successfully...");
		t.commit();		
	}
	//this method is to retrive data
	public void fetchStudent() {
		Scanner sc = new Scanner(System.in);
		//taking values
		int id;
		System.out.println("Enter id: ");
		id = sc.nextInt();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Student s1 = session.get(Student.class, id);
		System.out.println(s1.getId()+ " " + s1.getName()+ " "+ s1.getDept()+ " " + s1.getEmail()+ " " + s1.getPhone());//printing values
	}
}
