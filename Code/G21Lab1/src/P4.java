
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SirGeT
 */
public class P4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter weight in pounds : ");
        double w = input.nextDouble();
        System.out.printf("Enter height in inches : ");
        double h = input.nextDouble();
        double sum;
        sum = (w*0.45359237)/(h*h*0.0254*0.0254);
        System.out.printf("BMI is %,.4f",sum);
    }
}
