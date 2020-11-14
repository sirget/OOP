
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
        System.out.print("Enter the number of lines : ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if(j <= i){
                    System.out.print(j);
                }   
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            for (int k = 2; k <= n; k++) {
                if(k <= i){
                    System.out.print(k);
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
