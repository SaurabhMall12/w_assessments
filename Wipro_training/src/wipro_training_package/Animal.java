package wipro_training_package;

public class Animal {
	
	
	
	void legs() {
    	System.out.println("have 4 legs");
    }

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.barking();
		
		Cat c1 = new Cat();
		
		c1.meow();
		
		System.out.println(c1.breed);
		
		System.out.println(d1.color);
		
		Puppy p1 = new Puppy();
		
		d1.legs();
		
		p1.run();
		System.out.println(p1.breed);
		
		System.out.println(p1.age);
		
		Kitten k1 = new Kitten();
		
		k1.eat();
		
        
	}

}
class Dog extends Animal{
	String breed = "retriever";
	int age = 5;
	String color = "golden";	
	void barking() {
		System.out.println("dog barks");
	}
}

class Cat{
	String breed = "persian";
	int age = 2;
	String color = "white";
	
	void meow() {
		System.out.println("cat meow");
	}
}

class Puppy extends Dog{
	
	void run() {
		System.out.println("running");
	}
	
	int age = 1;
	
}

class Kitten extends Cat{
	
	void eat() {
		System.out.println("Kitten eats");
	}
}
