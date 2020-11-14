/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P3;

/**
 *
 * @author SirGeT
 */
public class TestEdible {
    public static void main(String[] args) {
        Edible e1 = new Orange();
        if(e1 instanceof Orange)
            System.out.println(e1.howToEat());
        else
            System.out.println(" ");
        Animal t1 = new Tiger();
        Chicken c1 = new Chicken();
        System.out.println(t1.sound());
        System.out.println(c1.sound());
        System.out.println(c1.howToEat());
        
    }
}
