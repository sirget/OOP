/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author SirGeT
 */
public class P3 {
    public static void main(String[] args) {
        String temp;
        Scanner input = new Scanner(System.in);
        String cities[] = new String[3];
        System.out.print("Enter the first city : ");
        cities[0] = input.nextLine();
        System.out.print("Enter the second city : ");
        cities[1] = input.nextLine();
        System.out.print("Enter the third city : ");
        cities[2] = input.nextLine();
        Arrays.sort(cities);
        System.out.println("The three cities in alphabetical order are " + cities[0] + " " + cities[1] + " " + cities[2]);
    }
}
