package se.jiderhamn.aspectj.escape;

/**
 * @author Mattias Jiderhamn
 */
public class Main {
  public static void main(String[] args) {
    Data data = new Data();
    System.out.println("In main, data is " + data.getInteger() + " and " + data.getString());
    Web.print(data);
  }
}