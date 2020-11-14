
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
public class P1 {
    public static void main(String[] args) {
        int now, future ;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day : ");
        now = input.nextInt();
        System.out.print("Enter the number of days elapsed since today : ");
        future = input.nextInt();
        System.out.print("Today is ");
        day(now);
        System.out.print(" and the future day is ");
        day((now + future)%7);
        
    }
    static void day(int a) {
        switch(a)
        {
            case 0 : System.out.print("Sunday"); break;
            case 1 : System.out.print("Monday"); break;
            case 2 : System.out.print("Tuesday"); break;
            case 3 : System.out.print("Wednesday"); break;
            case 4 : System.out.print("Thursday"); break;
            case 5 : System.out.print("Friday"); break;
            case 6 : System.out.print("Saturday"); break;
            
        }
    }
}
