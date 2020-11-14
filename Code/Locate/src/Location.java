/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SirGeT
 */
public class Location {
    
    public static int row;
    public static int column;
    public static double maxValue;
    
    Location(){
        
    }
  
    public static Location locateLargest(double[][] a){
        maxValue = a[0][0];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] > maxValue){
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        Location l = new Location();
        return l;
    }
}
