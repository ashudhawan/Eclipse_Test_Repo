package JUnitTest_Package;

public class EmployeeDetails 
{

	private String name;
	private int age;
	private double salary;
	
	public void setName(String name)
	{
		this.name=name;
	}

//Getname property added
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	public double getSalary()
	{
		return salary;
	}
}
