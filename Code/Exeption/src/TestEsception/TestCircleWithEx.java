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
public class TestCircleWithEx {
    public static void main(String[] args) {
        try {
            //new CircleWithException(5.5);
            //System.out.println("555555");
            CircleWithException c1 = new CircleWithException(5);
            System.out.println(c1.toString());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("End of program");
        
    }

    private static class CircleWithException {
        private double radius;

        public CircleWithException(double radius) throws Exception {
                setRadius(radius);
        }

        private void setRadius(double radius) throws Exception{
            if(radius <= 0){
                throw new Exception("radius cannot be zero");
            }
            else
                this.radius = radius;
        }
    }
}
