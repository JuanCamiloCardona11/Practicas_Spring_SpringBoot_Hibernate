package dev.j3c.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {

   @Before("execution(* addAccount(dev.j3c.aopdemo.Account))")
   public void beforeAddAccount() {
      System.out.println("\n*******Executing @Before advice on addAccount(Account)*******");
   }

   @Before("execution(* deleteAccount(int))")
   public void beforeDeleteAccount() {
      System.out.println("\n*******Executing @Before advice on deleteAccount(Account)*******");
   }

   @Before("execution(* upgradeAccount(..))")
   public void beforeUpgradeAccount() {
      System.out.println("\n*******Executing @Before advice on upgradeAccount(Account)*******");
   }



}
