package se.jiderhamn.aspectj.callExecution;

public class Main {
  
  public static void main(String[] args) throws Exception {
    System.out.println("Normal call:");
    Callee.method();

    System.out.println();

    System.out.println("Reflection:");
    Callee.class.getDeclaredMethod("method").invoke(null);
  }
  
}