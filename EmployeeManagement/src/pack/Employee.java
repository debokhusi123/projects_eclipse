package pack;

public class Employee {

private int empId;
private String name;
private double salary;
private String desg;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int empId, String name, double salary, String desg) {
	super();
	this.empId = empId;
	this.name = name;
	this.salary = salary;
	this.desg = desg;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}
}
