package com.ums.daoimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.ums.config.HibernateUtil;
import com.ums.dao.UniversityDao;
import com.ums.entity.Student;
import com.ums.entity.University;

public class UniversityDaoimpl implements UniversityDao{
	Session session=HibernateUtil.getSessionFactory().openSession();
	Transaction t=session.beginTransaction();

	@SuppressWarnings("deprecation")
	public void addStudent() {
		University u=new University();
		u.setUid(493);
		u.setUlocation("kolkata");
		u.setUemail("university@gmail.com");
		u.setUname("Calcutta University");
		u.setUhead("rahul chowdhury");
		
		Student s=new Student();
		s.setSname("owashim chowdhury");
		s.setSaddress("malda");
		s.setEmail("owashim@gmail.com");
		s.setSdept("IT");
		s.setScontact(987556456);
		
		Student s1=new Student();
		s1.setSname("tom");
		s1.setSaddress("kolkata");
		s1.setEmail("tom.com");
		s1.setSdept("IT");
		s1.setScontact(877556456);
		
		Student s2=new Student();
		s2.setSname("sam");
		s2.setSaddress("kolkata");
		s2.setEmail("sam.com");
		s2.setSdept("IT");
		s2.setScontact(777556456);
		
		ArrayList<Student> a1=new ArrayList<Student>();
		a1.add(s);
		a1.add(s1);
		a1.add(s2);
		u.setStudent(a1);
		
		session.save(u);
		t.commit();
	}

public void fetchStudent() {
		
		Query q = session.createQuery("From University");
		// list with University entity
		List<University> al = q.getResultList();
		// traversing 
		Iterator<University> itr = al.iterator();
		while(itr.hasNext()) {
		// fetching the data
		University u1 = itr.next();
		System.out.println("         -----------University Details-----------");
		System.out.println(u1.getUname()+" "+u1.getUemail());
		}
		
		Query q1 = session.createQuery("From Student");
		// list with Student entity
		List<Student> al1 = q1.getResultList();
		// traversing 
		Iterator<Student> itr1 = al1.iterator();
		
		System.out.println("         -----------Student Details-----------");
		while(itr1.hasNext()) {
		// fetching the data
		Student s = itr1.next();
		System.out.println(s.getSname()+" "+s.getSdept()+" "+s.getSaddress()+" "+s.getEmail()+" "+s.getS_rollno());
		
		}
	}


}

