package dev.j3c.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

   public void addAccount() {
      System.out.println(this.getClass().getSimpleName() + ": Doing some stuff, adding a membership account");
   }

   public void addSillyMember() {
      System.out.println(this.getClass().getSimpleName() + ": Doing some stuff, adding a silly member");
   }

   public void deleteSillyMember(int idMember) {
      System.out.println(this.getClass().getSimpleName() + ": Doing some stuff, deleting a silly member");
   }

}
