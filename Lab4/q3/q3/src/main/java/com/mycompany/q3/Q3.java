

package com.mycompany.q3;


public class Q3 {

    public static void main(String[] args) {
    student x1=new student();
    x1.setID(011);
    x1.setName("mahima");
    x1.setCourse("SE");
        System.out.println("SID is "+x1.getID());
        System.out.println("Student name is "+x1.getName());
        System.out.println("course is "+x1.getCourse());
        
        lecture x2=new lecture();
        x2.setID(2525);
        x2.setName("pavithra");
        x2.setpro("CS");
        System.out.println("LID is "+x2.getID());
        System.out.println("Lecture name is "+x2.getName());
        System.out.println("programme is "+x2.getpro());
    }
}
