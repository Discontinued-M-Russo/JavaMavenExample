package com.mr.core.example;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class Example
{
    private static final Logger logger = Logger.getLogger(Example.class);

    public static void main( String[] args )
    {

        Rectangle rect = new Rectangle();

        double rectHeight = 2.0;
        double rectWidth = 2.5;
        logger.info("Height = " +rectHeight);
        logger.info("Width = " +rectWidth);

        double rectArea;
        double rectPerimeter;

        rect.setHeight(rectHeight);
        rect.setWidth(rectWidth);

        rectArea = rect.getArea();
        logger.debug("Area = " +rectArea);

        rectPerimeter = rect.getPerimeter();
        logger.debug("Perimeter = " +rectPerimeter);

    }
}
