package se.jiderhamn.aspectj.handler;

import java.io.IOException;

public class Main {
  
  public static void main(String[] args) {
    try {
      foo();
    }
    catch (IOException ioex) {
      System.out.println("Catching " + ioex);
    }
  }

  private static void foo() throws IOException {
    throw new IOException("foo");
  }

}