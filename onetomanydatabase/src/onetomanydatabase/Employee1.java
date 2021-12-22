package onetomanydatabase;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee1 implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 134344335435L;

// optional 

	@Id // Creating primary key column
	@GeneratedValue(strategy = GenerationType.AUTO) // automatic generating primary key
	@Column(name = "EmployeeID") // naming column as specified name
	private int empID;

	@Column(name = "EmployeeName")
	private String empName;

	@Column(name = "EmployeeAddress")
	private String empAddress;

	@Column(name = "EmployeeContact")
	private long empContact;

	@OneToOne(cascade = CascadeType.ALL) // perform Operation on the child class
	private Laptop laptop;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Phone> telephones;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Email> emails;
	
	

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

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

	public List<Phone> getTelephones() {
		return telephones;
	}

	public void setTelephones(List<Phone> telephones) {
		this.telephones = telephones;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Employee1 [empID=" + empID + ", empName=" + empName + ", empAddress=" + empAddress + ", empContact="
				+ empContact + ", laptop=" + laptop + ", telephones=" + telephones + ", emails=" + emails + "]";
	}

	
	

}