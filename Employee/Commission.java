package Employee;

public class Commission extends Hourly {
	private double totalSales; 
	private double commissionRate; 
	
	public Commission(String name, String address, String phone, String socSecNumber, double rate, double commissionRate) {
		super(name, address, phone, socSecNumber, rate);
		this.commissionRate = commissionRate; 	
	}
	
	public void addSales(double totalSales) {
		this.totalSales = totalSales; 
	}
	
	public double pay() {
		return super.pay() + (totalSales * commissionRate);
	}
	
	public String toString() {
		return super.toString() + ", total sales : " + totalSales;
	}
}


