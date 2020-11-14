/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;

import java.util.Calendar;
/**
 *
 * @author SirGeT
 */
public class TestCalender {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        //cal.set(2019, 7, 5);
        System.out.println(cal.getTime());
        cal.set(2019, 7, 5+21);
        System.out.println(cal.getTime());
    }
}
