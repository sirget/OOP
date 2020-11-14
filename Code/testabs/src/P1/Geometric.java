/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

import java.util.Date;

/**
 *
 * @author SirGeT
 */
public abstract class Geometric {
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected Geometric(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
}
