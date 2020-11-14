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
public class TestChain {
    public static void main(String[] args) {
        try {
            methot1();
        } catch (Exception ex) {
            System.out.println(ex);
            //ex.printStackTrace();
        }
    }

    static void methot1() throws Exception{
        try {
            method2();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    private static void method2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
