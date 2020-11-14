/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SirGeT
 */
public class Compute {
    public static void main(String[] args) {
        
        double n1 = Double.valueOf(args[0]);
        double n2 = Double.valueOf(args[2]);
        
        System.out.print("Result of " + args[0] + " " + args[1] + " " + args[2] + " is ");
        
        switch(args[1]){
            case "+" :
                System.out.printf("%.0f",n1+n2);
                break;
            case "-" :
                System.out.printf("%.0f",n1-n2);
                break;
            case "*" :
                System.out.printf("%.0f",n1*n2);
                break;
            case "/" :
                if((n1/n2)%1>0){
                    System.out.printf("%.6f",n1/n2);
                }
                else{
                    System.out.printf("%.0f",n1/n2);
                }
                break;
            default :
                break;
        }
    }
}
