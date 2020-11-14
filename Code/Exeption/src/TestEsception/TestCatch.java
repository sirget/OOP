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
public class TestCatch {
    public static void main(String[] args) {
        int[] n = new int[]{4,8,7};
        Object o = null;
        try {
            //System.out.println(1 / 0);
            //System.out.println(n[3]);
            System.out.println(o.toString());
        } 
//catch (ArithmeticException e1) {
//            System.out.println(e1);
//        } catch (IndexOutOfBoundsException e2) {
//            System.out.println(e2);
//        } catch (NullPointerException e3) {
//            System.out.println(e3);
//        } 
//        catch (Exception e4) {
//            System.out.println(e4.toString());
//        } 
//        catch (Throwable e5) {
//            System.out.println(e5.toString());
//        }
        catch(ArithmeticException | IndexOutOfBoundsException | NullPointerException e6){
            System.out.println(e6);
        }
        finally {
            System.out.println("After");
        }
    }
}
