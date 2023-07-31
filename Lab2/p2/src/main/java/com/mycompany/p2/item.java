
package com.mycompany.p2;



public class item {
    protected int location;
    protected String description;
    public item(int location,String description)
    {
        this.location=location;
        this.description=description;
    }
    public void setValue1(int location)
    {
        this.location=location;
    }
    public int getValue1()
    {return location;}
    public void setValue2(String description)
    {
        this.description=description;
    }
    public String getValue2()
    {return description;}
}
