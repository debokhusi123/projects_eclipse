package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestDiscriminating {
public static <E> void main(String[] args) {
	SessionFactory sf=HibernateUtility.getSessionFactory();
	Session s=sf.openSession();
	Criteria crt=s.createCriteria(Person.class);
	List<E> list=crt.list();
	Iterator<E> it=list.iterator();
	while(it.hasNext())
	Person p=(Person)it.next();
	if(p instanceof Customer)
	{Customer c=(Customer)p;
	System.out.println(c.getUid()+c.getName()+c.getBankName());
	}
	else if(p instanceof Student)
	{Student s1=(Student)p;
	System.out.println(s1.getUid()+s1.getName()+s1.getGrades());
	}
	else
	{System.out.println(p.getUid()+p.getName());
		
	}


}
}



