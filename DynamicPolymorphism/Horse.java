package DynamicPolymorphism;

/**
 * @author Amelia Nathasa
 * @since 2022-04-08
 * @version 1.0
 */

public class Horse extends Animal {
	@Override
	public void sound() {
		System.out.println("Neigh");
	}
	
	public static void main(String args[]) {
		Animal obj = new Horse();
		obj.sound();
	}
}




