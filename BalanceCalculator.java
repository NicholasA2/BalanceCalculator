/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancecalculator;
import java.util.Scanner;
/**
 *
 * @author Nicholas Adiohos
 */
public class BalanceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Let's start by getting the user's input
        Scanner myInitialBalance = new Scanner(System.in);
        Scanner myAnnualInterestRate = new Scanner(System.in);
        Scanner myYears = new Scanner(System.in);
        
        System.out.print("Please enter the initial balance: $");
        double InitialBalance = myInitialBalance.nextDouble();
        System.out.print("Please enter the annual interest rate: ");
        double InterestRate = myAnnualInterestRate.nextDouble();
        System.out.print("Please enter the number of years the client wants to save the money in the bank: ");
        int Years = myYears.nextInt();
        
        //Now we re-display all the info
        System.out.printf(String.format("%nInitial Balance \t\t:%10.2f\n", InitialBalance));
        System.out.printf("Annual Interest Rate \t:%9.2f%%\n", InterestRate);
        System.out.printf("Saving Years \t\t:%10s\n", Years);
        System.out.println("-------------------------------------");
        
        //Now calculate balance
        double NewBalance = InitialBalance * Math.pow(1 + InterestRate / 100, Years);
        //And we print the answer
        System.out.printf(String.format("Balance After " + Years + " Years \t:%10.2f\n" , NewBalance));
       
    }
    
}
