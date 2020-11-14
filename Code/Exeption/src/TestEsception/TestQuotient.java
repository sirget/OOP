/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestEsception;

import java.util.Scanner;

/**
 *
 * @author SirGeT
 */
public class TestQuotient {

    public static void main(String[] args) {
        //demo1(); //program crash
        //demo2(); // not good
        //demo3();
        //System.out.println(1.0/0);
        System.out.println("End of program");

    }

    static void demo1() {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.println(n1 / n2);
    }

    static void demo2() {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        if (n2 == 0) {
            System.out.println("divisor can not be zero");
            System.exit(1);
        }
        System.out.println(n1 / n2);

    }

    static void demo3() {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        try {
            quotient(n1, n2);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
//    static void quotient(int n1, int n2) {
//        if(n2==0) {
//            System.out.println("divisor can not be zero");
//            System.exit(1);
//        }
//        System.out.println(n1/n2);
//    }

    static void quotient(int n1, int n2) {
        if (n2 == 0) {
            throw new ArithmeticException("divisor can not be zero");
        }
        System.out.println(n1 / n2);
    }
}
