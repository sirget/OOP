package P1;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Power1stZ
 */
public class P1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Array's size : ");
        int size = input.nextInt();
        int[] rNum = new int[size];
        int[] num = new int[100];
        for (int i = 0; i < 100; i++) {
            num[i] = (int) (Math.random() * 101);
        }

        for (int i = 0; i < 100; i++) {
            try {
                rNum[i] = num[i];
                System.out.println("index " + i + " : " + rNum[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Out of Bounds");
                break;
            }
        }

    }

}
