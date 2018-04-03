package pack1;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpringProject {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	Restaurent restaurantObj=(Restaurent) context.getBean("restaurentBean");
   restaurantObj.greetCustomer();
}  
}