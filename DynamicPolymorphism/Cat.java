package DynamicPolymorphism;

/**
 * @author Amelia Nathasa
 * @since 2022-04-08
 * @version 1.0
 */

public class Cat extends Animal{
	@Override 
	public void sound() {
		System.out.println("Meow");
	}
	
	public static void main(String args[]) {
		Animal obj = new Cat();
		obj.sound();
	}
}





