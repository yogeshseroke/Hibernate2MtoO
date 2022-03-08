package scs;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
public class MtoO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Dept d=new Dept();
		d.setDeptid(1);
		d.setDeptname("CS");
		Employee e1=new Employee();
		e1.setEmpid(103);
		e1.setEmpname("shubham");
		Employee e2=new Employee();
		e2.setEmpid(102);
		e2.setEmpname("nitin");
		Transaction tx=s.beginTransaction();
		s.save(e1);
		s.save(e2);
		tx.commit();
		s.close();
		sf.close();
		
	}

}
