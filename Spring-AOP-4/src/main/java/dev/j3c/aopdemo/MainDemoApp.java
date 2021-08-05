package dev.j3c.aopdemo;

import dev.j3c.aopdemo.dao.AccountDAO;
import dev.j3c.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {
   public static void main(String[] args) {

      AnnotationConfigApplicationContext context =
              new AnnotationConfigApplicationContext(DemoConfig.class);

      AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
      MembershipDAO membersipDAO = context.getBean("membershipDAO", MembershipDAO.class);

      accountDAO.addAccount(new Account());
      accountDAO.upgradeAccount(new Account(), 3);
      accountDAO.deleteAccount(1);

      membersipDAO.addAccount();
      membersipDAO.addSillyMember();
      membersipDAO.deleteSillyMember(2);


      context.close();

   }
}
