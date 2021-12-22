
public class EmployeeDetails {
	private String name;
	private double monthlySalary;
	private int age;
	// Getter Setter and Constructor
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public EmployeeDetails(String name, double monthlySalary, int age) {
		super();
		this.name = name;
		this.monthlySalary = monthlySalary;
		this.age = age;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [name=" + name + ", monthlySalary=" + monthlySalary + ", age=" + age + "]";
	}
	
	
	
	// Calculate the appraisal amount of employee
		public double calculateAppraisal(EmployeeDetails employeeDetails) {
			double appraisal = 0;

			if (employeeDetails.getMonthlySalary() < 10000) {
				appraisal = 500;
			} else {
				appraisal = 1000;
			}

			return appraisal;
		}




	
	
	
	
	
	
	
}
