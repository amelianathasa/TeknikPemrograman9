package StaticPolymorphism;

/**
 * @author Amelia Nathasa
 * @since 2022-04-08
 * @version 1.0
 */

public class MethodOverloading {
	public static void main(String args[]) {
		Overload Obj = new Overload(); 
		double result; 
		Obj.demo(10);
		Obj.demo(10, 20);
		result = Obj.demo(5.5);
		System.out.println("O/P : " + result);
	}
}







