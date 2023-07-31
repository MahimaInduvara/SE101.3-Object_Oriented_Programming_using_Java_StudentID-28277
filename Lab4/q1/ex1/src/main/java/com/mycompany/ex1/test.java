
package com.mycompany.ex1;


public class test {
     public static void main(String[] args) {
       employee x1=new employee();
       employee x2=new employee();
       x1.setid(01);
       x1.setname("Mr.Bogdan" );
       x1.setdes("manager");
       x2.setid(02);
       x2.setname("Ms.Bird ");
       x2.setdes("manager");
         System.out.println("Name is "+x1.getname());
         System.out.println("ID is "+x1.getid());
         System.out.println("Designation is "+x1.getdes());
         System.out.println("");
          System.out.println("Name is "+x2.getname());
         System.out.println("ID is "+x2.getid());
         System.out.println("Designation is "+x2.getdes());
    }
}
