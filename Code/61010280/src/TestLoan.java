
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SirGeT
 */
public class TestLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entet Loan : ");
        double loanAmount = input.nextDouble();
        System.out.print("Enter number of years : ");
        int numOfYears = input.nextInt();
        System.out.printf("%-20s%-20s%-20s\n", "Interest Rate", "Monthly Payment", "Total Payment");
        for (double annualInterestRate = 5.0; annualInterestRate <= 10.0; annualInterestRate += 1.0 / 4)
        {
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numOfYears * 12)));
            double totalPayment = monthlyPayment * numOfYears * 12;
            System.out.printf("%5.3f%c %20.2f %20.2f\n", annualInterestRate,'%', monthlyPayment, totalPayment);
        }
    }
}
