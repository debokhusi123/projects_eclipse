package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class TestCriteria 
{public static <E> void main(String[] args) {
	SessionFactory sf=HibernateUtility.getSessionFactory();
	Session s=sf.openSession();
	Criteria crt=s.createCriteria(Employee.class);
	crt.add(Restrictions.between("id", 200, 600));
	crt.add(Restrictions.gt("salary", 30000.0));
	List<E> list=crt.list();
	Iterator<E> it=list.iterator();
	while(it.hasNext())
	{Employee e=(Employee) it.next();
	System.out.println(e.getId()+e.getName()+e.getSalary());
	}
	s.close();
	sf.close();
	}
	
	
}

