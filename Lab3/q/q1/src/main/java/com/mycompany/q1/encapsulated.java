
package com.mycompany.q1;


public class encapsulated {
    private String name;
    private int age;
    private float salary;
    float bonus,bonusamount;
    
    public encapsulated(String name,int age,float salary,float bonus)
    {this.name=name;
    this.age=age;
    this.salary=salary;
    this.bonus=bonus;}
    
    public String getname()
    {return name;}
    
    public int getage()
    {return age;}
   
    public float getsal()
    {return salary;}
    
    public float bonus()
    {return bonus;}
    public float bamount()
    {bonusamount=salary+bonus;
    return bonusamount;}
}
