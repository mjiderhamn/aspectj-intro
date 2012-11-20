package se.jiderhamn.aspectj.handler;

import java.io.IOException;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class HandlerAspect {
  
  @Before("handler(java.io.IOException+) && args(e)")
  public void beforeCatchingIOException(IOException e) throws Throwable {
    System.out.println("About to catch " + e);
    
  }
  
  
}