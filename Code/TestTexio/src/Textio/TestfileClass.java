/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Textio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SirGeT
 */
public class TestfileClass {

    public static void main(String[] args) {
        try {
            //demo1();
            demo3();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    static void demo1() {
        File file = new File("Test.txt");
        try {
            try ( PrintWriter out = new PrintWriter(file)) {
                out.print("Hello Java");
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }

    static void demo2() throws IOException {
        File file = new File("Test.txt");
        try {
            try ( FileWriter out = new FileWriter(file, true)) {
                try {
                    try ( BufferedWriter bw = new BufferedWriter(out)) {
                        bw.append("Good bye");
                    }
                } catch (IOException e1) {
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }

    static void demo3() throws FileNotFoundException {
        File file = new File("Test.txt");
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            System.out.print(input.next());
        }
    }
}
