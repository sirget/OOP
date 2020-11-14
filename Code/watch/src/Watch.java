
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SirGeT
 */
public class Watch {
    public static void main(String[] args) {
        Stopwatch t1 = new Stopwatch();
        Random random = new Random();
        byte[] bytes = new byte[100000];
        random.nextBytes(bytes);
        t1.start();
        sort(bytes);
        t1.stop();
        System.out.println(t1.getElapsedTime());
    }
    private static void sort(byte arr[]) 
    { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            byte temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    }
}
