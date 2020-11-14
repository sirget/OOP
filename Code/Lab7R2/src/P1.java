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
        Queue q1 = new Queue();
        for(int i = 1; i <= 20; i++)
            q1.enqueue(i);
        while(!q1.empty())
            System.out.print(q1.dequeue() + " ");
        
    }
}
