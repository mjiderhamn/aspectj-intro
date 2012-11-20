package se.jiderhamn.aspectj.callExecution;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CallVsExecutionAspect {
  
  @Before("execution(* se.jiderhamn.aspectj.callExecution.Callee.*(..))")
  public void execution(JoinPoint joinPoint) {
    System.out.println("execution(): " + joinPoint);
  }

  @Before("call(* se.jiderhamn.aspectj.callExecution.Callee.*(..))")
  public void call(JoinPoint joinPoint) {
    System.out.println("call(): " + joinPoint);
  }
}