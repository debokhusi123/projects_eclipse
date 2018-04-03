package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestHQL {

	public static <E> void main(String[] args) {
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session s=sf.openSession();
		String hibernateQuery="select e.name,e.salary from pack.Employee e ";
		Query query=(Query)s.createQuery(hibernateQuery);
		List<E> list=query.list();
		Iterator<E> it =list.iterator();
		while(it.hasNext())
		{Object[] obj=(Object[])it.next();
		String name=(String)obj[0];
		double salary=(D,m ouble)obj[1];
		System.out.println(name+""+salary);
		}
		/*{Employee e=(Employee) it.next();
		System.out.println(e.getId()+e.getName()+e.getSalary());
		}
		System.out.println("*****to retrieve only name of employee****");
		String secondQuery="select obj.name,obj.salary from pack.Employee obj ";
		Query query2=s.createQuery(secondQuery);
		List<E> list2=query2.list();
	
		Iterator<E> it2 =list2.iterator();
		while(it2.hasNext())
		{String empNames=(String)it2.next();
		System.out.println(empNames);
		}*/
		
		s.close();
		sf.close();
		}
}


