/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author SirGeT
 */
public class TestFileStream {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //demo1();
        //demo2();
        //demo3();
        demo4();
        demo5();
    }

    static void demo1() throws FileNotFoundException {
        File file = new File("Testtext.txt");
        try ( PrintWriter output = new PrintWriter(file)) {
            output.write("Hello Java");
        }
    }

    static void demo2() throws FileNotFoundException {
        File file = new File("Testtext.txt");
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            System.out.print(input.next());
        }
    }

    static void demo3() throws IOException {
        File file = new File("Testtext.txt");
        try ( FileWriter out = new FileWriter(file, true);  BufferedWriter bw = new BufferedWriter(out)) {
            bw.append("\nGood Afternoon");
        }
    }

    static void demo4() throws FileNotFoundException, IOException {
        File file = new File("TestBinary.dat");
        try ( FileOutputStream output = new FileOutputStream(file)) {
            output.write(128);
            byte[] b = {1, 2, 9};
            output.write(b);
        }
    }

    static void demo5() throws FileNotFoundException, IOException {
        File file = new File("TestBinary.dat");
        try ( FileInputStream input = new FileInputStream(file)) {
            System.out.println(input.read());
            byte[] b = new byte[3];
            input.read(b);
            for (byte c : b) {
                System.out.println(c);
            }
        }
    }
}
