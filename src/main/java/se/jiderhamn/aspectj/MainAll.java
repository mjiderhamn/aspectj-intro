package se.jiderhamn.aspectj;

/**
 * @author Mattias Jiderhamn
 */
public class MainAll {
  public static void main(String[] args) {
    se.jiderhamn.aspectj.calculator.Main.main(args);
    
    System.out.println();
    System.out.println();
    
    se.jiderhamn.aspectj.modifiable.Main.main(args);
    
    System.out.println();
    System.out.println();
    
    se.jiderhamn.aspectj.escape.Main.main(args);
  }
}