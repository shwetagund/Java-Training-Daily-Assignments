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
public class CountriesCurrencies implements Serializable {

	private static final long serialVersionUID = 7144115798199856451L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long CounteryId;
	private long CurrencyId;

	@OneToOne(cascade = CascadeType.ALL)
	private Currencies currencies;

	@OneToOne(cascade = CascadeType.ALL)
	private Countires Countries;

	public long getCounteryId() {
		return CounteryId;
	}

	public void setCounteryId(long counteryId) {
		CounteryId = counteryId;
	}

	public long getCurrencyId() {
		return CurrencyId;
	}

	public void setCurrencyId(long currencyId) {
		CurrencyId = currencyId;
	}

	public Currencies getCurrencies() {
		return currencies;
	}

	public void setCurrencies(Currencies currencies) {
		this.currencies = currencies;
	}

	public Countires getCountries() {
		return Countries;
	}

	public void setCountries(Countires countries) {
		Countries = countries;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(CounteryId, Countries, CurrencyId, currencies);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountriesCurrencies other = (CountriesCurrencies) obj;
		return CounteryId == other.CounteryId && Objects.equals(Countries, other.Countries)
				&& CurrencyId == other.CurrencyId && Objects.equals(currencies, other.currencies);
	}

	@Override
	public String toString() {
		return "CountriesCurrencies [CounteryId=" + CounteryId + ", CurrencyId=" + CurrencyId + ", currencies="
				+ currencies + ", Countries=" + Countries + "]";
	}

	
}
