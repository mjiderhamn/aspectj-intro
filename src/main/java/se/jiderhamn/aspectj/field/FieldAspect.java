package se.jiderhamn.aspectj.field;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class FieldAspect {
  
  @Around("get(int se.jiderhamn.aspectj.field.Fields.counter)")
  public Object modifyGet(ProceedingJoinPoint joinPoint) throws Throwable {
    int value = (Integer) joinPoint.proceed();
    int newValue = value * 2;
    System.out.println("Getting '" + joinPoint.getSignature().getName() + "' " + value + " -> " + newValue);
    return newValue;
  }
  
  @Around("set(int se.jiderhamn.aspectj.field.Fields.sum)")
  public Object modifySet(ProceedingJoinPoint joinPoint) throws Throwable {
    int value = (Integer) joinPoint.getArgs()[0];
    int newValue = value + 2;
    System.out.println("Setting '" + joinPoint.getSignature().getName() + "' " + value + " -> " + newValue);
    return joinPoint.proceed(new Object[] {newValue});
  }
  
}