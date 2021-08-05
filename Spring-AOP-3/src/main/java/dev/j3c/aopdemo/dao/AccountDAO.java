package dev.j3c.aopdemo.dao;

import dev.j3c.aopdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {


   public void addAccount(Account account) {
      System.out.println(this.getClass() + ": Doing my DB work: Adding an account");
   }

   public void deleteAccount(int accountId) {
      System.out.println(this.getClass() + ": Doing my DB work: Deleting an account");
   }

   public void upgradeAccount(Account account, int grade) {
      System.out.println(this.getClass() + ": Doing my DB work: Upgrading account to grade: " + grade);
   }
}
