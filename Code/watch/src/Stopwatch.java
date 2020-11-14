/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SirGeT
 */
public class Stopwatch {
    
    private double startTime;
    private double stopTime;
    
    public void Stopwatch(){
        
    }
    
    public void start(){
        java.util.Date date = new java.util.Date();
        startTime = date.getTime();
    }
    
    public void stop(){
        java.util.Date date = new java.util.Date();
        stopTime = date.getTime();
    }
    
    public double getElapsedTime(){
        return (stopTime - startTime)/1000;
    }

}
