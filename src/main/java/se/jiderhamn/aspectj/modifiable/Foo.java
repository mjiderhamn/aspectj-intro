package se.jiderhamn.aspectj.modifiable;

public class Foo implements Modifiable {
  
  private boolean modified;
  
  private String bar;

  public boolean isModified() {
    return modified;
  }

  public void setModified(boolean modified) {
    this.modified = modified;
  }

  public String getBar() {
    return bar;
  }

  public void setBar(String bar) {
    this.bar = bar;
  }
}