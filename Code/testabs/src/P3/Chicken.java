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
public class Chicken extends Animal implements Edible{

    @Override
    public String sound() {
        return "8E88";
    }

    @Override
    public String howToEat() {
        return "Fry it!";
    }
    
}
