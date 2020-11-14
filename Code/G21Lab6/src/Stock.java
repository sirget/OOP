/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SirGeT
 */
public class Stock {
    
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    
    public void Stock(){
        
    }
    
    public void Stock(String a,String b){
        symbol = a;
        name = b;
    }
    
    public void setPrice(double a,double b){
        previousClosingPrice = a;
        currentPrice = b;
    }
    
    public double getChangePercent()
    {
        return 100 * ((currentPrice - previousClosingPrice)/previousClosingPrice);
    }
}
