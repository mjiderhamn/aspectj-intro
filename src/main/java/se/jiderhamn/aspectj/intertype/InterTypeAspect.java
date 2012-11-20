package se.jiderhamn.aspectj.intertype;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class InterTypeAspect {
  
  @DeclareParents(value = "se.jiderhamn.aspectj.intertype.Car", defaultImpl = AnimalImpl.class)
  Animal animal;
  
  public static class AnimalImpl implements Animal {
    public int getNoOfLegs() {
      return 4;
    }
  }

  @DeclareParents(value = "se.jiderhamn.aspectj.intertype.Car", defaultImpl = FruitImpl.class)
  Fruit fruit;
  
  public static class FruitImpl implements Fruit {
    public String getColor() {
      return "Yellow";
    }
  }
}