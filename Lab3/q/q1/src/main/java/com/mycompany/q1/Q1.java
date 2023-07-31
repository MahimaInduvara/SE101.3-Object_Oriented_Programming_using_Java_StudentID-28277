
package com.mycompany.q1;


public class Q1 {

    public static void main(String[] args) {
      encapsulated x=new encapsulated("mahima",23,50000f,10000f);
        System.out.println("Employee name is "+x.getname());
        System.out.println("age is "+x.getage());
        System.out.println("basic salary is "+x.getsal());
        System.out.println("bonus is "+x.bonus());
        System.out.println("bonus amount is "+x.bamount());
    }
}
