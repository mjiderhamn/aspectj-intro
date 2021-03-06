package se.jiderhamn.aspectj.calculator;

public class Calculator {
  
  @Factor(Math.PI)
  public double add(double a, double b) {
    return a + b;
  }
  
  public double subtract(double a, double b) {
    return a - b;
  }
  
  public double divide(int a, int b) {
    return a / b;
  }    
}