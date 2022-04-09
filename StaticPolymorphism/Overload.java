package StaticPolymorphism;

/**
 * @author Amelia Nathasa
 * @since 2022-04-08
 * @version 1.0
 */

class Overload {
	void demo(int a) {
		System.out.println("a: " + a);
	}
	
	void demo(int a, int b) {
		System.out.println("a and b: " + a + "," + b);
	}
	
	double demo(double a) {
		System.out.println("double a: " + a);
		return a*a;
	}
}






