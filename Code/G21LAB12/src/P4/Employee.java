/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Power1stZ
 */
public class Employee {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Salary.txt");
        String[] data = new String[2];
        int cAssistant = 0;
        int cAssociate = 0;
        int cFull = 0;

        double sAssistant = 0;
        double sAssociate = 0;
        double sFull = 0;
        Scanner read = new Scanner(file);
        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < 4; j++) {
                if (j % 2 == 0) {
                    data[0] = read.next();
                } else {
                    data[1] = read.next();
                }
            }
            if (data[0].equals("assistant")) {
                double salary = Double.parseDouble(data[1]);
                cAssistant++;
                sAssistant += salary;
            } else if (data[0].equals("associate")) {
                double salary = Double.parseDouble(data[1]);
                cAssociate++;
                sAssociate += salary;
            } else if (data[0].equals("full")) {
                double salary = Double.parseDouble(data[1]);
                cFull++;
                sFull += salary;
            }

        }
        System.out.print("Total salary for assistant professor is ");
        System.out.printf("%.2f\n", sAssistant);
        System.out.print("Total salary for associate professor is ");
        System.out.printf("%.2f\n", sAssociate);
        System.out.print("Total salary for full professor is ");
        System.out.printf("%.2f\n", sFull);
        System.out.print("Total salary for all professor is ");
        System.out.printf("%.2f\n", sAssistant + sAssociate + sFull);

        System.out.print("Average salary for assistant professor is ");
        System.out.printf("%.2f\n", sAssistant / cAssistant);
        System.out.print("Average salary for associate professor is ");
        System.out.printf("%.2f\n", sAssociate / cAssociate);
        System.out.print("Average salary for full professor is ");
        System.out.printf("%.2f\n", sFull / cFull);
        System.out.print("Average salary for all professor is ");
        System.out.printf("%.2f\n", (sAssistant + sAssociate + sFull)
                / (cAssistant + cAssociate + cFull));

    }
}
