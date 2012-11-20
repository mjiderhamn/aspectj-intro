package se.jiderhamn.aspectj.retry;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Retry {
  
  int maxRetries();
  
}
