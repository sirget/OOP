/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

/**
 *
 * @author SirGeT
 */
public class Circle extends Geometric{
    private double radius;

    public Circle(String color, boolean filled) {
        super(color, filled);
    }
    
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    
    
}
