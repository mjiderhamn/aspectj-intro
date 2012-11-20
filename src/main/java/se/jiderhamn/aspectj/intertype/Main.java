package se.jiderhamn.aspectj.intertype;

public class Main {
  public static void main(String[] args) {
    Car car = new Car("Volvo");
    System.out.println("Car? " + (car instanceof Car));
    System.out.println(car + " is a " + car.getBrand());

    System.out.println();
    
    System.out.println("Animal? " + (car instanceof Animal));
    if(car instanceof Animal) {
      System.out.println(car + " has " + ((Animal)car).getNoOfLegs() + " legs");
    }

    System.out.println();
    
    System.out.println("Fruit? " + (car instanceof Fruit));
    if(car instanceof Fruit) {
      System.out.println(car + " is " + ((Fruit)car).getColor());
    }
    
  }
}