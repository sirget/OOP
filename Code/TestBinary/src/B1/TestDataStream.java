/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author SirGeT
 */
public class TestDataStream {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        demo1();
        demo2();
    }

    static void demo1() throws FileNotFoundException, IOException {
        File file = new File("TestDataStream.dat");
        FileOutputStream fos = new FileOutputStream(file);
        try ( DataOutputStream output = new DataOutputStream(fos)) {
            output.write(25);
            output.writeChars("Get");
            output.writeUTF("aaaaa");
            output.flush();
        }
    }

    static void demo2() throws FileNotFoundException, IOException {
        File file = new File("TestDataStream.dat");
        FileInputStream fis = new FileInputStream(file);
        try ( DataInputStream input = new DataInputStream(fis)) {
            //System.out.println(input.readLine());
            System.out.println(input.readByte());
            while (input.available() != -1) {
                System.out.println(input.readChar());
            }
        }
    }
}
