package com.allopertioninspringboot.alldatabaseoperation.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Regions implements Serializable {
	private static final long serialVersionUID = 7144115798199856451L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long RegionId;
	private String Name;

	@OneToMany(cascade = CascadeType.ALL)
	private Countires Countries;

	public long getRegionId() {
		return RegionId;
	}

	public void setRegionId(long regionId) {
		RegionId = regionId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
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
		return Objects.hash(Countries, Name, RegionId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Regions other = (Regions) obj;
		return Objects.equals(Countries, other.Countries) && Objects.equals(Name, other.Name)
				&& RegionId == other.RegionId;
	}

	@Override
	public String toString() {
		return "Regions [RegionId=" + RegionId + ", Name=" + Name + ", Countries=" + Countries + "]";
	}

}
