package pack;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestCRUD
{
	public static void main(String[] args) {
		System.out.println("Doing update operation by passing id at runtime");
		Scanner sc=new Scanner(System.in);
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		System.out.println("Enter an id");
		int tempId=sc.nextInt();
		sc.nextLine();
		Employee e=(Employee) s.get(Employee.class,tempId);
		if(e!=null)
		{
//			System.out.println("OLD NAME:"+e.getName());
//		System.out.println("Enter name to update");
//		String tempName=sc.nextLine();
//		e.setName(tempName);
//		System.out.println("NEW NAME:"+e.getName());
//		s.update(e);
		//System.out.println("Enter name to delete");
	 /* String tempName=sc.nextLine();
		e.setName(tempName);
		System.out.println("NEW NAME:"+e.getName());*/
		s.delete(e);
		tx.commit();
		}
		else
		{System.err.println("Sorry id"+tempId+"not found");
		}
		s.close();
		sf.close();
		sc.close();
		
		
		}
		
		
		
	}


