package scs;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
public class Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("select e.empid,e.empname,d.deptid,d.deptname from Dept d inner join d.dept e");
		List lst=q.list();
		Iterator it=lst.iterator();
		while(it.hasNext())
		{
			Object arr[]=(Object[])it.next();
			System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
		}
		s.close();
	}

}
