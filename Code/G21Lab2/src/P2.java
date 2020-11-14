
import java.util.Scanner;
import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SirGeT
 */
public class P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2) : ");
        int userin = input.nextInt();
        Random rand = new Random();
        int r = rand.nextInt(3);
        System.out.print("The computer is ");
        compa(r);
        System.out.print(". You are ");
        compa(userin);
        if(r == userin)
            System.out.print(" too. It is a draw");
        else
        {
            System.out.print(".");
            if(userin - r == 1 || userin - r == -2)
                System.out.print(" You won");
            if(userin - r == -1 || userin - r == 2)
                System.out.print(" You lose");
        }
        
    }
    static void compa(int a) {
        switch(a)
        {
            case 0 : System.out.print("scissor"); break;
            case 1 : System.out.print("rock"); break;
            case 2 : System.out.print("paper"); break;
        }
    }
}
