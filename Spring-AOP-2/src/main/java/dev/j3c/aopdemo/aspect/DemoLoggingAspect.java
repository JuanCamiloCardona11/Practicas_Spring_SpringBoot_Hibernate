package dev.j3c.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {

   @Before("execution(public void addAccount())")
   public void beforeAddAccountAdviceAnyClass() {
      System.out.println("\n*******Executing @Before advice on addAccount()*******");
   }

   @Before("execution(public void dev.j3c.aopdemo.dao.AccountDAO.addAccount())")
   public void beforeAddAccountAccount() {
      System.out.println("\n*******Executing @Before advice on addAccount() in AccountDAO*******");
   }

   @Before("execution(public void dev.j3c.aopdemo.dao.MembersipDAO.addAccount())")
   public void beforeAddAccountMembership() {
      System.out.println("\n*******Executing @Before advice on addAccount() in MembershipDAO*******");
   }

   @Before("execution(public * add*())")
   public void beforeAddAccountMethodStartingAdd() {
      System.out.println("\n*******Executing @Before advice on any method starting with 'add'*******");
   }

   @Before("execution(* dev.j3c.aopdemo.dao.MembersipDAO.*())")
   public void beforeAddAccountAnyMothodOnMembersipDAO() {
      System.out.println("\n*******Executing @Before advice on any method in MembershipDAO class*******");
   }

}
