/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestEsception;


/**
 *
 * @author SirGeT
 */
public class TestCustom {
    public static void main(String[] args) {
        try {
            demo1();
        } catch (SomExceoption ex) {
            System.out.println(ex);
        }
    }

    private static void demo1() throws SomExceoption{
        throw new SomExceoption("555"); //To change body of generated methods, choose Tools | Templates.
    }

    private static class SomExceoption extends Exception {

        public SomExceoption(String message) {
            super(message);
        }
    }
}
