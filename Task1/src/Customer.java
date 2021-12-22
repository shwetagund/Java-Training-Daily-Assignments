import java.util.Objects;

public class Customer {
     private String custName;
     private int custId;
	
     public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", custId=" + custId + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(custId, custName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return custId == other.custId && Objects.equals(custName, other.custName);
	} 
    
     
}
