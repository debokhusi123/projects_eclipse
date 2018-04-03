package pack;


import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
 EmployeeService service=(EmployeeService) context.getBean("service");
Employee employee=(Employee)context.getBean("EmployeeObject");

		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();;
		do
		{System.out.println("1,Add");
		   System.out.println("2,DeleteById");
		   System.out.println("3,DisplayAll");
		   System.out.println("4,UpdateById");
		   System.out.println("5,Exit");
		   System.out.println("Please enter your choice");
		    
		    switch(ch){
		    case 1://add
		    	System.out.println("ADD");
		    	System.out.println("enter the employee id,employee name,employee designation and employee salary to be added");
		    	 employee.setEmpId(sc.nextInt());
		    	 employee.setName(sc.next());
		    	employee.setSalary(sc.nextDouble());
		    	employee.setDesg(sc.next());
		    	service.insert(employee);
		    	System.out.println("Record inserted");
		       break;
		    	
			  case 2://delete the employee based on id
		   System.out.println("DELETE THE EMPLOYEE BASED ON ID");
	    	System.out.println("enter the employee id for which the employee has to be deleted");
	    	  int empId=sc.nextInt();
	    	 service.delete(employee);
	    	 System.out.println("Record deleted");
	    	 
	    	 break;
		    
			  case 3://display all
			    System.out.println("displays all employees");
			  List<Employee>l=service.getAllEmployees();
			  for(Employee e:l)
			System.out.println(e.getEmpId()+""+e.getName()+""+e.getSalary()+""+e.getDesg());
	    	     	  
	    	   break;
			  		  
	    	   case 4://update By id
	    	    System.out.println("Updating employee object by Id");
	    		   System.out.println("enter the employee name which the employee has to be updated");
	  	    	 String name=sc.next();
	    		   
	  	    	 service.update(employee);
	  	    	 System.out.println("record updated"+name);
	  	    	 break;
		    
	    	   case 5:
	    	    System.out.println("Exit from employee");
	    	   
		    }
		}
	
		while(ch!=5);
	}
}
	

	    	   
		
		    

	  	    	 
	  	    	 
	    		   
	    	 
		    
	    	  
		    
	    	 
		    
	    	 
		    
		    
		    


    