package se.jiderhamn.aspectj.field;

@SuppressWarnings("FieldCanBeLocal")
public class Fields {
  
  private static int counter;
  
  private static int sum;
  
  public static void main(String[] args) {
    for(counter = 0; counter < 100; counter++) {
      sum += 5;
    }

    System.out.println("The answer is: " + sum);
  }  
}