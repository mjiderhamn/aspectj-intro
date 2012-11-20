package se.jiderhamn.aspectj.retry;

public class Main {
  public static void main(String[] args) {
    System.out.println("Fail 2 times:");
    run(new Failing(2));

    System.out.println();

    System.out.println("Fail 5 times");
    run(new Failing(5));
  }
  
  private static void run(Failing failing) {
    try {
      failing.mayFail();
    }
    catch(Exception ex) {
      ex.printStackTrace(System.out);
    }
  }
}