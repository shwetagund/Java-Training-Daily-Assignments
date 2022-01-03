package com.allopertioninspringboot.alldatabaseoperation.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customers implements Serializable {

	private static final long serialVersionUID = 7144115798199856451L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long CustomersId, CountryId;
	private String fname, lname, Email, Phone;

	@OneToOne(cascade = CascadeType.ALL)
	private Sales sale;

	public Long getCustomersId() {
		return CustomersId;
	}

	public void setCustomersId(Long customersId) {
		CustomersId = customersId;
	}

	public Long getCountryId() {
		return CountryId;
	}

	public void setCountryId(Long countryId) {
		CountryId = countryId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public Sales getSale() {
		return sale;
	}

	public void setSale(Sales sale) {
		this.sale = sale;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CountryId, CustomersId, Email, Phone, fname, lname, sale);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customers other = (Customers) obj;
		return Objects.equals(CountryId, other.CountryId) && Objects.equals(CustomersId, other.CustomersId)
				&& Objects.equals(Email, other.Email) && Objects.equals(Phone, other.Phone)
				&& Objects.equals(fname, other.fname) && Objects.equals(lname, other.lname)
				&& Objects.equals(sale, other.sale);
	}

	@Override
	public String toString() {
		return "Customers [CustomersId=" + CustomersId + ", CountryId=" + CountryId + ", fname=" + fname + ", lname="
				+ lname + ", Email=" + Email + ", Phone=" + Phone + ", sale=" + sale + "]";
	}

}
