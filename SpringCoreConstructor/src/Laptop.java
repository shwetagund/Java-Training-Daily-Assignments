import java.util.Objects;

public class Laptop {

	 private long lid;
	    private String cpu;
	    private int ram;
		
	    public long getLid() {
			return lid;
		}
		public void setLid(long lid) {
			this.lid = lid;
		}
		public String getCpu() {
			return cpu;
		}
		public void setCpu(String cpu) {
			this.cpu = cpu;
		}
		public int getRam() {
			return ram;
		}
		public void setRam(int ram) {
			this.ram = ram;
		}
		
		
		@Override
		public String toString() {
			return "Laptop [lid=" + lid + ", cpu=" + cpu + ", ram=" + ram + "]";
		}
		public Laptop(long lid, String cpu, int ram) {
			super();
			this.lid = lid;
			this.cpu = cpu;
			this.ram = ram;
		}
		public Laptop() {   //default constructor
			super();
		} 
	    
	    
}
