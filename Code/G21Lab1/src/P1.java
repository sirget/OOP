/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author SirGeT
 */
public class P1 {
    public static void main(String[] args) {
        double born,death,immigrant,inpop;
        born = (365*24*60*60)/7.0;
        death = (365*24*60*60)/13.0;
        immigrant = (365*24*60*60)/45.0;
        inpop = 312032486;
        for (int i = 0; i < 5; i++) {
            inpop += born;
            inpop += immigrant;
            inpop -= death;
            System.out.print(i+1 + " = ");
            System.out.printf("%,.2f\n",inpop);
            
        }
    }
}
