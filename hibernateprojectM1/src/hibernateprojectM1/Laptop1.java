package hibernateprojectM1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Audited
public class Laptop1 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer laptopID;
	// @Audited
	private String modelNo;

	public Integer getLaptopID() {
		return laptopID;
	}

	public void setLaptopID(Integer laptopID) {
		this.laptopID = laptopID;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	@Override
	public String toString() {
		return "Laptop1 [laptopID=" + laptopID + ", modelNo=" + modelNo + "]";
	}

}