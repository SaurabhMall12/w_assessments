package sample;

interface Vehicle1{
	
	void start();
	void stop();
}

class Car1 implements Vehicle1{
	
	public void start() {
		System.out.println("Car starts with a key");
	}
	
	public void stop() {
		System.out.println("Car stops with the brake");
	}
}

class E_Car implements Vehicle1{
	
	public void start() {
		System.out.println("Electric car starts with button");
	}
	
	public void stop() {
		System.out.println("Electric car stops silently");
		
	}
	
}

public class Interface1 {

	public static void main(String[] args) {
		Car1 c = new Car1();
		c.start();
		c.stop();
		E_Car e = new E_Car();
        e.start();
        e.stop();

	}

}
