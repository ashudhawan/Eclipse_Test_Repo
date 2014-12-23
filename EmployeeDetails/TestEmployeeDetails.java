package JUnitTest_Package;

import org.junit.Test;

import static org.junit.Assert.assertEquals;;

public class TestEmployeeDetails 
{
	EmployeeDetails employee=new EmployeeDetails();
	EmpBusinessLogic empBusinessLogic=new EmpBusinessLogic();
	
	@Test
	public void testCalculateAppraisal()
	{
		employee.setName("Rajeev");
		employee.setAge(28);
		employee.setSalary(8000);
		double appraisal=empBusinessLogic.calculateAppraisal(employee);
		assertEquals(500,appraisal,0.0);
	}
	
	//test to check yearly salary
	@Test
	public void testCalculateAnnualSalary()
	{
		employee.setName("Rajeev");
		employee.setAge(28);
		employee.setSalary(8000);
		double salary=empBusinessLogic.calculateSalary(employee);
		assertEquals(96000,salary,0.0);
	}
}
