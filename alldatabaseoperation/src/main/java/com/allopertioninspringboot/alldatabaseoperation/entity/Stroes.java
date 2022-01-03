package com.allopertioninspringboot.alldatabaseoperation.entity;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Stroes {
	private static final long serialVersionUID = 7144115798199856451L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long CustomerId;
	private String fname, lname, Email, Phone, CountryId;

	@OneToOne(cascade = CascadeType.ALL)
	private Sales sale;

	public long getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(long customerId) {
		CustomerId = customerId;
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

	public String getCountryId() {
		return CountryId;
	}

	public void setCountryId(String countryId) {
		CountryId = countryId;
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
		return Objects.hash(CountryId, CustomerId, Email, Phone, fname, lname, sale);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stroes other = (Stroes) obj;
		return Objects.equals(CountryId, other.CountryId) && CustomerId == other.CustomerId
				&& Objects.equals(Email, other.Email) && Objects.equals(Phone, other.Phone)
				&& Objects.equals(fname, other.fname) && Objects.equals(lname, other.lname)
				&& Objects.equals(sale, other.sale);
	}

	@Override
	public String toString() {
		return "Stroes [CustomerId=" + CustomerId + ", fname=" + fname + ", lname=" + lname + ", Email=" + Email
				+ ", Phone=" + Phone + ", CountryId=" + CountryId + ", sale=" + sale + "]";
	}

}
