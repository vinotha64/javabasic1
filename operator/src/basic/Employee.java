package basic;

public class Employee {
double salary;
	String  firstName;
    String lastName;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary>0)	
	    this.salary = salary;
	}
		
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void calculation() {
		salary=(salary*1.1)*12;
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
	Employee e1=new Employee();
	Employee e2=new Employee();
    e1.setSalary(120);
    e2.setSalary(300);
    System.out.println(e1.getSalary());
    System.out.println(e2.getSalary());
    e1.calculation();
    e2.calculation();
	}
}

