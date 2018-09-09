package abstraction;

public abstract class Car {
	public void engine() {
				// Concrete method
		System.out.println("Check the engine of used car before buying");
	}
	public void tyre() {
				// Concrete method
		System.out.println("Change the tyres if it is long time run");
		
	}
	public abstract void radiator(); // Abstract method
	
	public abstract void cooling();	 // Abstract method
	
	public static void main (String[] args) {
		Car car = new Ford();
		car.cooling();
		car.radiator();
	}
}
