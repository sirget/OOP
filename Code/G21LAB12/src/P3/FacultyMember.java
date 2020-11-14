/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Power1stZ
 */
public class FacultyMember {

    public static void main(String[] args) throws IOException {
        File file = new File("Salary.txt");
        for (int i = 1; i <= 1000; i++) {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append("FirstName" + i + " LastName" + i);
            int rd = (int) (Math.random() * 3);
            if (rd == 0) {
                bw.append(" assistant ");
                double salary = (double) ((Math.random() * 30000) + 50000);
                String s = String.format("%.2f", salary);
                bw.append(s + "\n");

            } else if (rd == 1) {
                bw.append(" associate ");
                double salary = (double) ((Math.random() * 50000) + 60000);
                String s = String.format("%.2f", salary);
                bw.append(s + "\n");

            } else {
                bw.append(" full ");
                double salary = (double) ((Math.random() * 55000) + 75000);
                String s = String.format("%.2f", salary);
                bw.append(s + "\n");

            }
            bw.close();
        }

    }

}
