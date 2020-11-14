/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 61010216
 */
public class Staff extends Employee{
    private String title;

    public Staff() {
        this("-","-","-","-","-",0,"-");
    }

    public Staff(String name, String address, String phoneNumber, String email, String office,double salary,String title) {
        super(name, address, phoneNumber, email, office, salary);
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + "\ntitle: " + title;
    }
    
}
