package com.mr.core.example;

/**
 * Created by 105051313 on 3/19/18.
 */
public class Rectangle
    implements IShape
{
    double height;
    double width;

    public Rectangle() {
        height=0;
        width=0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height=height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width=width;
    }

    public double getArea() {
        return height*width;
    }

    public double getPerimeter() {
        return 2*(height+width);
    }
}
