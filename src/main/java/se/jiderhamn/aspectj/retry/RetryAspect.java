package se.jiderhamn.aspectj.retry;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class RetryAspect {
  
  @Around("execution(@se.jiderhamn.aspectj.retry.Retry * *..*(..))")
  public Object retry(ProceedingJoinPoint joinPoint) throws Throwable {
    
    Exception exception = null;
    int retries = ((MethodSignature)joinPoint.getSignature()).getMethod().getAnnotation(Retry.class).maxRetries();
    for(int i = 1; i <= retries; i++) {
      try {
        return joinPoint.proceed();
      }
      catch (Exception ex) {
        // We may want to retry only on certain types of exceptions
        exception = ex;
        // Here we might want to wait for a configurable number of milliseconds
      }
    }    
    throw exception;
  }  
}