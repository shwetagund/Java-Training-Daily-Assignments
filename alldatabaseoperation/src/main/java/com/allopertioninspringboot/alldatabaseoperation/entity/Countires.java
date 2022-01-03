package com.allopertioninspringboot.alldatabaseoperation.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Countires implements Serializable {
	private static final long serialVersionUID = 7144115798199856451L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long CountryId;
	private String Name, RegionId;

	public long getCountryId() {
		return CountryId;
	}

	public void setCountryId(long countryId) {
		CountryId = countryId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRegionId() {
		return RegionId;
	}

	public void setRegionId(String regionId) {
		RegionId = regionId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CountryId, Name, RegionId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Countires other = (Countires) obj;
		return CountryId == other.CountryId && Objects.equals(Name, other.Name)
				&& Objects.equals(RegionId, other.RegionId);
	}

	@Override
	public String toString() {
		return "Countires [CountryId=" + CountryId + ", Name=" + Name + ", RegionId=" + RegionId + "]";
	}

}
