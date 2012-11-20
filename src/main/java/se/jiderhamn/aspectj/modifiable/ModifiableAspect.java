package se.jiderhamn.aspectj.modifiable;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ModifiableAspect {
  
  @Pointcut("execution(* (se.jiderhamn.aspectj.modifiable.Modifiable+).set*(..))")
  public void setter() { }
  
  @Pointcut("execution(* *.setModified(..))")
  public void setModified() { }

  @After("setter() && ! setModified() && target(callee)")
  public void makeModified(Modifiable callee) {
    callee.setModified(true);
  }
  
}