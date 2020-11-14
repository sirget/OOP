/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;

import java.util.Scanner;

/**
 *
 * @author Power1stZ
 */
public class TestTriangle {

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner input = new Scanner(System.in);
        System.out.print("Side1 : ");
        double s1 = input.nextDouble();
        System.out.print("Side2 : ");
        double s2 = input.nextDouble();
        System.out.print("Side3 : ");
        double s3 = input.nextDouble();
        try {
            Triangle samliam = new Triangle(s1, s2, s3);
        } catch (IllegalTriangleException ex) {
            System.out.println(ex);
        }

    }
}
