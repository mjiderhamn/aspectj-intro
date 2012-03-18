package se.jiderhamn.aspectj;

/**
 * @author Mattias Jiderhamn
 */
public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();

    System.out.println("10 + 20 = " + calculator.add(10, 20));

    System.out.println("50 - 30 = " + calculator.subtract(50, 30));

    System.out.println("75 / 3  = " + calculator.divide(75, 3));
  }
}