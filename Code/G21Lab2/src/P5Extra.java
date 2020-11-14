
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
public class P5Extra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 1,i=1,j=1;
        while(i<=n)
        {
            if(i<=n)
            {
                System.out.print(sum + ",");
                sum += j*2;
                i++;
            }
            if(i<=n)
            { 
                System.out.print(j*3 + ",");
                i++;
            }
            j++;
        }   
    }
}
