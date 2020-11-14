
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SirGeT
 */
public class P3 {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the size for the matrix: ");
                int size = input.nextInt();
                int[][] intmtx = new int[size][size];
                fillmtx(intmtx);
                displaymtx(intmtx);
                checkmtx(intmtx);
        }
 
        public static void fillmtx(int metrix[][]) {
                for (int i = 0; i < metrix.length; i++) {
                    for (int j = 0; j < metrix[i].length; j++) {
                        metrix[i][j] = (int) ((int)0 + Math.random()* (2));
                    }
                }
        }
 
        public static void checkmtx(int metrix[][]) {
                boolean found = false;
                for (int i = 0; i < metrix.length; ++i) {
                    int intResult = checkRow(i, metrix);
                    if (intResult != 2) {
                        found = true;
                        System.out.println("All " + intResult + "s on row " + i);
                    }
                }
                if (found == false) { 
                    System.out.println("No same numbers on a row");
                }
                found = false;
                for (int i = 0; i < metrix.length; ++i) {
                    int intResult = checkCol(i, metrix);
                    if (intResult != 2) {
                        found = true;
                        System.out.println("All " + intResult + "s on column " + i);
                    }
                }
                if (found == false) {
                    System.out.println("No same numbers on a column");
                }
                int intsuper = checksuperDia(metrix);
                int intsub = checksubDia(metrix); 
                if (intsuper != 2) {
                    System.out.println("All " + intsuper + "s on superdiagonal");
                } else {
                    System.out.println("No same numbers on the superdiagonal");
                }
 
                if (intsub != 2) {
                    System.out.println("All " + intsub + "s on subdiagonal");
                } else {
                    System.out.println("No same numbers on the subdiagonal");
                }
        }
 
        public static void displaymtx(int metrix[][]) {
                for (int i = 0; i < metrix.length; i++) {
                    for (int j = 0; j < metrix[i].length; j++) {
                        System.out.print(metrix[i][j]);
                    }
                    System.out.println("");
                }
        }
 
        public static int checkRow(int intRow, int intMetrix[][]) {
                for (int i = 1; i < intMetrix[intRow].length; i++) {
                    if (intMetrix[intRow][i] != intMetrix[intRow][0])
                        return 2;
                }
                return intMetrix[intRow][0];
        }
 
        public static int checkCol(int intCol, int intMetrix[][]) {
                for (int i = 1; i < intMetrix.length; i++) {
                    if (intMetrix[i][intCol] != intMetrix[0][intCol])
                        return 2;
                }
                return intMetrix[0][intCol];
        }
 
        public static int checksuperDia(int intMetrix[][]) {
                for (int i = 1; i < intMetrix.length; i++) {
                    if (intMetrix[i][i] != intMetrix[0][0])
                        return 2;
                }
                return intMetrix[0][0];
        }
 
        public static int checksubDia(int intMetrix[][]) {
                int intSize = intMetrix.length - 1;
                for (int i = 1; i < intMetrix.length; i++) {
                    if (intMetrix[i][intSize - i] != intMetrix[0][intSize])
                    return 2;
                }
                return intMetrix[0][0];
        }
}
