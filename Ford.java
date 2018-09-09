package abstraction;

public class Ford extends Car{

	@Override
	public void radiator() {
		System.out.println("Ford car is good car");
		
	}

	@Override
	public void cooling() {
		System.out.println("Engine of Ford car is durable");
		
	}
	public static void main(String[]args) {
		Car car = new Ford();
		car.engine();
		car.cooling();
		car.radiator();
		car.tyre();
	
		
	}

}
