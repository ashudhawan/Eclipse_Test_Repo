package JUnitTest_Package;

public class EmpBusinessLogic 
{

	/**
	 * @param args
	 */
	public double calculateSalary(EmployeeDetails emp)
	{
		double totSalary=0;
		totSalary=emp.getSalary()*12;
		return(totSalary);
	}
	
	public double calculateAppraisal(EmployeeDetails emp)
	{
		double appraisal=0;
		if(emp.getSalary()<100000)
			appraisal=500;
		else
			appraisal=1000;
		return appraisal;
	}
}
