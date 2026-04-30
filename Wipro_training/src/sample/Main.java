package sample;


class Vehicle{
	
	void start() {
		System.out.println("vehicle started");
	}
	
}

class Car extends Vehicle{
	
	
	void drive() {
		
		System.out.println("driving");
		
	}
	
	
}

class ElectricCar extends Car{
	
	String fuel = "electricity";
	
	void charging() {
		System.out.println("charging");
	}
}



public class Main {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.start();
		c1.drive();
		
		
		ElectricCar e1 = new ElectricCar();
		e1.start();
		e1.drive();
		e1.charging();
		System.out.println(e1.fuel);
		

	}

}
