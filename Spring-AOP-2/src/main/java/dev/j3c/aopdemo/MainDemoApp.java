package dev.j3c.aopdemo;

import dev.j3c.aopdemo.dao.AccountDAO;
import dev.j3c.aopdemo.dao.MembersipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {
   public static void main(String[] args) {

      AnnotationConfigApplicationContext context =
              new AnnotationConfigApplicationContext(DemoConfig.class);

      AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
      MembersipDAO membersipDAO = context.getBean("membersipDAO", MembersipDAO.class);

      accountDAO.addAccount();
      membersipDAO.addAccount();

      context.close();

   }
}
