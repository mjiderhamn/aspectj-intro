package se.jiderhamn.aspectj.escape;

public class Data {

  public int getInteger() {
    return 4;
  }
  
  public String getString() {
    return "This string <a href=\"http://foo.com\" onclick=\"maliciousScript();\">needs escaping</a>";
  }

}