/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 61010216
 */
public class Student extends Person{
    
    private String[] status = {"freshman","sophomore","junior","senior"} ;
    private int indexStatus;
    
    public Student() {
    }

    public Student(String name, String address, String phoneNumber, String email,int indexStatus) {
        super(name, address, phoneNumber, email);
        this.indexStatus = indexStatus;
    }

    public String getStatus() {
        if(indexStatus>=0&&indexStatus<=3)return status[indexStatus-1];
        else  return "Unknown";
    }

    public void setStatus(int indexStatus) {
        this.indexStatus = indexStatus;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStatus: " + getStatus();
    }
    
    
}
