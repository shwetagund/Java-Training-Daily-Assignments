import java.util.Objects;

public class Product {
     private String productName;
     private String productId;
//     private int expDate;
     private String productType;
	
     public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productId=" + productId + ", productType=" + productType
				+ "]";
	}
     
	
}
