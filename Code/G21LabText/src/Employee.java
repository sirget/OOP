
import java.util.Date;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 61010216
 */
public class Employee extends Person{
    private String office;
    private double salary;
    private Date dateHired;

    public Employee() {
        this("-","-","-","-","-",0);
        this.dateHired = new Date();
    }

    public Employee(String name, String address, String phoneNumber, String email,String office, double salary) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new Date();
    }
    
    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return  super.toString() + "\nOffice: " + office + "\nSalary: $" + salary + "\nDate Hired: " + getDateHired();
    }

  
}
