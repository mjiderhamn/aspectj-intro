package se.jiderhamn.aspectj.calculator;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class CalculatorAspect {
  
  @Pointcut("execution(* se.jiderhamn.aspectj.calculator.Calculator.*(..))")
  public void calculation() { }
  
  @Before("calculation()")
  public void logMethodCalls(JoinPoint joinPoint) {
    System.out.println("Calling " + joinPoint.getSignature());
  }
  
  @Around("execution(@se.jiderhamn.aspectj.calculator.Factor * *.*(..))")
  public double factor(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    final Method method = ((MethodSignature) proceedingJoinPoint.getSignature()).getMethod();
    final double factor = method.getAnnotation(Factor.class).value();
    return (Double) proceedingJoinPoint.proceed() * factor;
  }
  
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
  @Pointcut("execution(* se.jiderhamn.aspectj.calculator.Calculator.divide(..))")
  public void divide() { }

  @AfterReturning(pointcut = "divide()", returning = "retVal")
  public void afterReturning(Object retVal) {
    System.out.println("divide() returned " + retVal);
  }  
  
  @AfterThrowing(pointcut = "divide()", throwing = "ex")
  public void translateException(ArithmeticException ex) {
    throw new RuntimeException("There was an error ('" + ex.getMessage() + "')"); 
  }

}