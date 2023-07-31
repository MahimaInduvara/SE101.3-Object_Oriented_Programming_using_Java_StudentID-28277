package com.mycompany.q4;

public class Rectangle extends Shape {
    private int length;
    private int width;
    private int area;

    
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        area=length*width; 
    }
    @Override
    public void display()
    {
        System.out.println(area);
    }
    
}
