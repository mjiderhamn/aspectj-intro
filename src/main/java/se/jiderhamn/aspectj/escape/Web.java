package se.jiderhamn.aspectj.escape;

public class Web {
  public static void print(Data data) {
    System.out.println("In Web, data is " + data.getInteger() + " and " + data.getString());
  }
}