package Employee;

/**
 * @author Amelia Nathasa
 * @since 2022-04-08
 * @version 1.0
 */

public class Volunteer extends StaffMember{
	public Volunteer(String eName, String eAddress, String ePhone) {
		super(eName, eAddress, ePhone);
	}
	
	public double pay() {
		return 0.0; 
	}
}


