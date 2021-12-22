package onetomanydatabase;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Laptop {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer laptopID;
    //@Audited
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
	

}
