
public class EmpBusinessLogic {
	// Calculate the yearly salary of employee
	public double calculateYearlySalary(EmployeeDetails employeeDetails) {
		double yearlySalary = 0;
		yearlySalary = employeeDetails.getMonthlySalary() * 12;
		return yearlySalary;
	}

	public double calculateAppraisal(EmployeeDetails employee) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}