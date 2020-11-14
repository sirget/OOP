
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
        System.out.printf("Enter a number between 0 and 1000 : ");
        int tmp = input.nextInt();
        int sum = 0;
        while (tmp > 0){
            sum += (tmp%10);
            tmp /= 10;
        } 
        System.out.printf("The sum of the digits is %d",sum);

    }
}
