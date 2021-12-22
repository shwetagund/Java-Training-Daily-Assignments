package sampleproject;

import java.util.Objects;

public class Employe {

	public long getEmpID() {
		return empID;
	}
	@Override
	public String toString() {
		return "Employe [empID=" + empID + ", name=" + name + ", address=" + address + ", phone=" + phone
				+ ", salaryPaid=" + salaryPaid + ", getEmpID()=" + getEmpID() + ", hashCode()=" + hashCode()
				+ ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ ", isSalaryPaid()=" + isSalaryPaid() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, empID, name, phone, salaryPaid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		return Objects.equals(address, other.address) && empID == other.empID && Objects.equals(name, other.name)
				&& Objects.equals(phone, other.phone) && salaryPaid == other.salaryPaid;
	}
	public void setEmpID(long empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isSalaryPaid() {
		return salaryPaid;
	}
	public void setSalaryPaid(boolean salaryPaid) {
		this.salaryPaid = salaryPaid;
	}
	private long empID;
    private String name,address,phone;
    private boolean salaryPaid;
}
