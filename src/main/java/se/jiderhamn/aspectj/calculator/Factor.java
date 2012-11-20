package se.jiderhamn.aspectj.calculator;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Factor {
  
  double value();
}
