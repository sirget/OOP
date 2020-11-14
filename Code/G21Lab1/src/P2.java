/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SirGeT
 */
public class P2 {
    public static void main(String[] args) {
        double a=3.4,b=50.2,c=2.1,d=0.55,e=44.5,f=5.9;
        double x,y;
        x = (e*d-b*f)/(a*d-b*c);
        y = (a*f-e*c)/(a*d-b*c);
        System.out.printf("x = %,.2f\n",x);
        System.out.printf("y = %,.2f",y);
    }
}
