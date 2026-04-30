package wipro_training_package;
abstract class Vehicle {
	
 abstract void start();
 void fuelType() {
     System.out.println("Vehicle uses fuel or battery");
 }
}

class Car extends Vehicle {

 @Override
 void start() {
     System.out.println("Car starts with key");
 }
}

class ElectricCar extends Vehicle {

 @Override
 void start() {
     System.out.println("Electric car starts with button");
 }
}
public class Main2 {
 public static void main(String[] args) {
     Vehicle v;

     v = new Car();
     v.start(); 
     v.fuelType();

     v = new ElectricCar();
     v.start();
     v.fuelType();
 }
}