/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 61010216
 */
public class Faculty extends Employee{
   private String officehours;
   private String rank;

    public Faculty() {
        this(" "," "," "," ",0," "," ");
    }

    public Faculty(String name, String address, String phoneNumber, String email, double salary,String officehours, String rank) {
        super(name, address, phoneNumber, email, officehours, salary);
        this.officehours = officehours;
        this.rank = rank;
    }

   @Override
    public String getOffice() {
        return officehours;
    }

   @Override
    public void setOffice(String officehours) {
        this.officehours = officehours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() + "\noffice: " + officehours + "\nrank: " + rank;
    }
   
}
