
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
public class P3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of rows and columns in the array : ");
        int row = input.nextInt();
        int column = input.nextInt();
        
        double[][] list = new double[row][column];
        System.out.print("Enter the array : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                list[i][j] = input.nextDouble();
            }
        }
        
        Location l = Location.locateLargest(list);
        
        System.out.print("The location of the largest element is " + l.maxValue + " at " + "(" + l.row + "," + l.column + ")");
        
    }
}
