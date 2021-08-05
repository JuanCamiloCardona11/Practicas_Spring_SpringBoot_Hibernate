package dev.j3c.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {

   @Pointcut("execution(public void dev.j3c.aopdemo.dao.*.*(..))")
   private void forDAOPackage(){}

   @Pointcut("execution(* deleteSillyMember(int))")
   private void beforeDeleteMemberAdvice(){}



   @Before("forDAOPackage()")
   public void beforeExecutionAnyMethod() {
      System.out.println("\n*******Executing @Before advice on any method on DAO package*******");
   }

   @Before("beforeDeleteMemberAdvice()")
   public void beforeAddAccount() {
      System.out.println("\n*******Executing @Before advice on deleteSillyMember(int)*******");
   }

   @Before("forDAOPackage() || beforeDeleteMemberAdvice()")
   public void beforeUpgradeAccount() {
      System.out.println("\n*******Executing @Before advice on any method in DAO package or beforeDeleteMemberAdvice(int)*******");
   }



}
