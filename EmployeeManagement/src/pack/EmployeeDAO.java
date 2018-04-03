package pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
	@Autowired
	private JdbcTemplate template;
	public void insert(Employee e)
	{template.update("insert into employee values(?,?,?,?)",
		               new Object[]{e.getEmpId(),e.getName(),e.getDesg(),e.getSalary()});
	}
	public List<Employee> getAllEmployees()
	{List<Employee> list=template.query("select *from Employee", new EmployeeRowMapper());
	return list;
	}
	
	public void delete( Employee e) {
		
		template.update("delete  from employee where id=?"+new Object[]{e.getEmpId()});
		
	}
	
	public void update(Employee e) {
		template.update("update id,salary,desg from Employee where name=name");
			
	}
}
	


