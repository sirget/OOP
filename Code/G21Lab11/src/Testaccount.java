
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SirGeT
 */
public class Testaccount {
    public static void main(String[] args) {
        Account account = new Account("George",1122,1000);
        account.setAnnuallnterestRate(1.5/100);
        account.deposit(30.0, " ");
        account.deposit(40.0, " ");
        account.deposit(50.0, " ");
        account.withdraw(5.0, " ");
        account.withdraw(4.0, " ");
        account.withdraw(2.0, " ");
        System.out.println("Name : " + account.getName());
        System.out.println("Balance : " + account.getBalance());
        System.out.println("Interest rate : " + account.getAnnuallnterestRate());
        for(int i = 0; i < account.getTransactions().size(); i++)
        {
            System.out.println(account.getTransactions().get(i).toString());
        }
    }
}
