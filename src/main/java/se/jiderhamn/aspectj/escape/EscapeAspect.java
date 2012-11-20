package se.jiderhamn.aspectj.escape;

import org.apache.commons.lang3.StringEscapeUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class EscapeAspect {
  
  @Around("call(java.lang.String se.jiderhamn.aspectj.escape.Data.*(..)) && within(se.jiderhamn.aspectj.escape.Web)")
  public String escape(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    return StringEscapeUtils.escapeHtml4((String) proceedingJoinPoint.proceed());
  }
  
}