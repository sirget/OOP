/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author SirGeT
 */
public class TestObjectStream {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        //demo1();
        demo2();
    }

    static void demo1() throws FileNotFoundException, IOException {
        File file = new File("TestObjectStream.dat");
        FileOutputStream fos = new FileOutputStream(file);
        try ( ObjectOutputStream output = new ObjectOutputStream(fos)) {
            output.writeObject(new Date());
            Circle c1 = new Circle();
            output.writeObject(c1);
            Circle c2 = new Circle(5.0);
            output.writeObject(c2);
        }
    }

    static void demo2() throws FileNotFoundException, IOException, ClassNotFoundException {
        File file = new File("TestObjectStream.dat");
        FileInputStream fis = new FileInputStream(file);
        try ( ObjectInputStream input = new ObjectInputStream(fis)) {
            System.out.println(input.readObject());
            System.out.println(input.readObject().toString());
            System.out.println(input.readObject().toString());
        }
    }
}

class Circle implements Serializable {

    private double radius;
    private static int numberOfObject;
    private transient B b;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
        numberOfObject++;
        b = new B();
    }

    @Override
    public String toString() {
        return "Circle{" + "radius = " + radius + " numberOfObject = " + numberOfObject + '}';
    }

}

class B {

}
