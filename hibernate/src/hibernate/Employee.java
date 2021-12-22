package hibernate;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee implements Serializable {
 
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="EmpID")
    private int empID;
 
    @Column(name="EmpName")
    private String empName;
 
    @Column(name="EmpAddress")
    private String empAddress;
 
    @Column(name="EmpContact")
    private long empContact;

    @OneToOne(cascade = CascadeType.ALL) // perform Operation on the child class
    private Laptop laptop;

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public long getEmpContact() {
		return empContact;
	}

	public void setEmpContact(long empContact) {
		this.empContact = empContact;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empAddress=" + empAddress + ", empContact="
				+ empContact + ", laptop=" + laptop + "]";
	}
    
}