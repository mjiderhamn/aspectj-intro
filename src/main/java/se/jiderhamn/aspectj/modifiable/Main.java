package se.jiderhamn.aspectj.modifiable;

/**
 * @author Mattias Jiderhamn
 */
public class Main {
  public static void main(String[] args) {
    Foo foo = new Foo();
    System.out.println("New is modified? " + foo.isModified());
    foo.getBar();
    System.out.println("Modified after get? " + foo.isModified());
    foo.setBar("baz");
    System.out.println("Modified after set? " + foo.isModified());
  }

}