/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SirGeT
 */
public class Time {
    
    private long hour, minute, second;
    
    Time(){
        second = System.currentTimeMillis() / 1000;
        genTime(second);
        
    }
    Time(long timepass){
        this.second = timepass / 1000;
        genTime(second);
    }
    Time(long hour, long minute, long second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public long getHour(){
        return hour;
    }
    public long getMinute(){
        return minute;
    }
    public long getSecond(){
        return second;
    }
    public void setTime(long elapseTime){
        this.second = elapseTime / 1000;
        genTime(second);
    }
    private void genTime(long second){
        hour = (second/3600);
        minute = (second%3600)/60;
        this.second = second%60;
    }
}
