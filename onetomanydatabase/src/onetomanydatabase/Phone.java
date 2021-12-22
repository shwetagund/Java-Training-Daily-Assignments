package onetomanydatabase;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Phone implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long phoneId;
	private String phoneNumber, type;

	public Long getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(Long phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", phoneNumber=" + phoneNumber + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(phoneId, phoneNumber, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		return Objects.equals(phoneId, other.phoneId) && Objects.equals(phoneNumber, other.phoneNumber)
				&& Objects.equals(type, other.type);
	}

}
