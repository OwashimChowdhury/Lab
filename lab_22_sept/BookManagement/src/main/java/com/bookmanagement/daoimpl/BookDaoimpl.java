package com.bookmanagement.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bookmanagement.config.HibernateUtil;
import com.bookmanagement.dao.BookDao;
import com.bookmanagement.entity.Book;






public class BookDaoimpl implements BookDao {
	Scanner sc=new Scanner(System.in);
	public void addBook() {
		
		System.out.println("enter Book_name: ");
		String bname=sc.next();
		System.out.println("enter price: ");
		int price=sc.nextInt();
		System.out.println("enter author_name: ");
		String author_name=sc.next();
		
		
		Book bd=new Book();
		bd.setBname(bname);
		bd.setAuthor(author_name);
		bd.setBprice(price);
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
	    session.save(bd);
	    t.commit();
		session.close();
		
	}

	public void fetchBook() {
		System.out.println("enter id: ");
		int id=sc.nextInt();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Book bd1=session.get(Book.class, id);
		System.out.println(bd1.getBid()+" "+bd1.getAuthor()+" "+ bd1.getBname()+" "+bd1.getBprice() );
		session.close();
		
	}

}
