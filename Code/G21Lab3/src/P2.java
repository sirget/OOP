
import java.util.Scanner;
import java.util.Arrays;
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
		Scanner input = new Scanner(System.in);
                
		System.out.print("Enter list1 : ");
		int[] list1 = new int[input.nextInt()];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
                }

		System.out.print("Enter list2 : ");
		int[] list2 = new int[input.nextInt()];
		for (int j = 0; j < list2.length; j++) {
			list2[j] = input.nextInt();
		} 
                
		int[] list3 = merge(list1, list2);

		System.out.print("The merged list is");
		for (int a : list3) {
			System.out.print(" " + a);
		}
	}

	public static int[] merge(int[] list1, int[] list2)  {
		int[] list3 = new int[list1.length + list2.length];
		
                System.arraycopy(list1, 0, list3, 0, list1.length);
                System.arraycopy(list2, 0, list3, list1.length, list2.length); 

		Arrays.sort(list3);

		return list3;
	}

}

