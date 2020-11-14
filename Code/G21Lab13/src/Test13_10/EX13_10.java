/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test13_10;

/**
 *
 * @author SirGeT
 */
public class EX13_10 {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(8, 9, "red", true);
        Rectangle r2 = new Rectangle(16, 4, "green", false);
        Rectangle r3 = new Rectangle(8, 9, "yellow", true);

        System.out.println("Rectangle1 Area :" + r1.getArea());
        System.out.println("Rectangle2 Area :" + r2.getArea());
        System.out.println("Rectangle3 Area :" + r3.getArea());

        System.out.println("Rectangle1 is " + (r1.equals(r2) ? "" : "not ")
                + "equal to Rectangle2");

        System.out.println("Rectangle1 is " + (r1.equals(r3) ? "" : "not ")
                + "equal to Rectangle3");
    }
}
