package com.allopertioninspringboot.alldatabaseoperation.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Currencies implements Serializable {
	private static final long serialVersionUID = 7144115798199856451L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long CurrencyId;
	private String Name;

	public Long getCurrencyId() {
		return CurrencyId;
	}

	public void setCurrencyId(Long currencyId) {
		CurrencyId = currencyId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CurrencyId, Name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Currencies other = (Currencies) obj;
		return Objects.equals(CurrencyId, other.CurrencyId) && Objects.equals(Name, other.Name);
	}

	@Override
	public String toString() {
		return "Currencies [CurrencyId=" + CurrencyId + ", Name=" + Name + "]";
	}

}
