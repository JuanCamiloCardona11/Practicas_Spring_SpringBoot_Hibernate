package dev.j3c.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {


   public void addAccount() {
      System.out.println(this.getClass() + ": Doing my DB work: Adding an account");
   }
}
