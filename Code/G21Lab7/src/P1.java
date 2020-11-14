/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SirGeT
 */
public class P1 {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(555550000);
        System.out.println(t1.getHour() + " : " + t1.getMinute() + " : " + t1.getSecond());
        System.out.println(t2.getHour()%24 + " : " + t2.getMinute() + " : " + t2.getSecond());
    }
}
