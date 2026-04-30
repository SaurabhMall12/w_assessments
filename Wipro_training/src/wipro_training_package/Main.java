package wipro_training_package;


 class Animal1{
	
	void leg() {
		System.out.println("have 4 legs");
	}
	
	void eat() {
		System.out.println("eating");
	}
}
 
 class Dog1 extends Animal1{
	 String breed = "retriever";
		int age = 5;
		String color = "golden";	
		void barking() {
			System.out.println("dog barks");
		}
 }
 
 class Cat1 extends Animal1{
		String breed = "persian";
		int age = 2;
		String color = "white";
		
		void meow() {
			System.out.println("cat meow");
		}
	}

public class Main {

	public static void main(String[] args) {
		Dog1 d1 = new Dog1();
		
		d1.barking();
		d1.eat();
		System.out.println(d1.breed);
		
		Cat1 c1 = new Cat1();
		c1.eat();
		c1.leg();
		c1.meow();
		
		System.out.println(c1.color);
		
	}

}
