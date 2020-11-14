/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author SirGeT
 */
public class TestRandomAccess {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("TestRandomAccess.dat");
        try ( RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            raf.writeChars("Get");
            raf.seek(0);
            for (int i = 0; i < 3; i++) {
                System.out.print(raf.readChar());
            }
        }
    }
}
