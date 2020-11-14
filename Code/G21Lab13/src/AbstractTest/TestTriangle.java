/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractTest;

import java.util.Scanner;

/**
 *
 * @author SirGeT
 */
public class TestTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 side of triangle : ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.println("Enter color of triangle : ");
        String color = input.next();
        System.out.println("Enter filled true or false : ");
        boolean filled = input.nextBoolean();

        GeometricObject triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println("\n" + triangle.toString());
        System.out.println("Area = " + triangle.getArea());
        System.out.println("Perimeter = " + triangle.getPerimeter());
        System.out.println("Color = " + triangle.getColor());
        System.out.println("Triangle is " + (triangle.isFilled() ? "" : "not ") + "filled");
    }
}
