/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SirGeT
 */
public class Queue {
    private int[] element;
    private int size=0;
    public static final int DEFAULT_CAPACITY = 8;
    
    public Queue(){
        this(DEFAULT_CAPACITY);
    }
    
    public Queue(int capacity){
        element = new int[capacity];
    }
    
    public void enqueue(int v){
        if(size >= element.length){
            int[] tmp = new int[element.length * 2];
            System.arraycopy(element, 0, tmp, 0, element.length);
            element = tmp;
        }
        element[size++] = v;
    }
    
    public int dequeue(){
        int x = element[0];
        
        int[] tmp2 = new int[element.length];
        System.arraycopy(element, 1, tmp2, 0, element.length-1);
        element = tmp2;
        size--;
        return x;
    }
    
    public boolean empty(){
        return size == 0;
    }
    
    public int getSize(){
        return size;
    }
    
}
