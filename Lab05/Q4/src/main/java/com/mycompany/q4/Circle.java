package com.mycompany.q4;

public class Circle extends Shape {
    private int radius;
    private double area;
    private double p=3.14;

    // Constructor
    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area= p* radius * radius;
    }
    @Override
    public void display()
    {
        System.out.println(area);
    }
}
