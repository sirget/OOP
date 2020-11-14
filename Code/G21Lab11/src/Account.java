
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SirGeT
 */
public class Account {
    private int id = 0;
    private double balance = 0;
    private double annuallnterestRate = 0;
    private Date dateCreated;
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    

    public Account() {
        dateCreated = new java.util.Date();
    }
    
    public Account(int id, double balance) {
        dateCreated = new java.util.Date();
        this.id = id;
        this.balance = balance;
    }

    public Account(String name, int id, double balance) {
        dateCreated = new java.util.Date();
        this.id = id;
        this.balance = balance;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    
    public double getMonthlyInterestRate() {
        return annuallnterestRate/12;
    }
    
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    
    public void withdraw(double wd, String desciption) {
        balance = balance - wd;
        Transaction tran = new Transaction('W',wd,balance,desciption);
        transactions.add(tran);
    }
    
    public void deposit(double dp, String desciption) {
        balance = balance + dp;
        Transaction tran = new Transaction('D',dp,balance,desciption);
        transactions.add(tran);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getTransactions() {
        return transactions;
    }

}
