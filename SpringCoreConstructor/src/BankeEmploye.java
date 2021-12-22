
public class BankeEmploye {
   private String bankEmploye;
   private boolean isPrivate;
   private Laptop laptop;

   public BankeEmploye(String bankEmploye, boolean isPrivate) {
	super();
	this.bankEmploye = bankEmploye;
	this.isPrivate = isPrivate;
}

public BankeEmploye() {
	super();
}

public Laptop getLaptop() {
	return laptop;
}

public void setLaptop(Laptop laptop) {
	this.laptop = laptop;
}

@Override
public String toString() {
	return "BankeEmploye [bankEmploye=" + bankEmploye + ", isPrivate=" + isPrivate + "]";
}
   
   
   
}

