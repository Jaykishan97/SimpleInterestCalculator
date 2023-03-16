package com.SimpleInterestCalculator;

import java.math.BigDecimal;
import java.util.Scanner;

public class SicRunner {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal: ");
        BigDecimal principal = scanner.nextBigDecimal();

        System.out.print("Enter interest rate: ");
        BigDecimal interest = scanner.nextBigDecimal();

        System.out.print("Enter number of years: ");
        int noOfYears = scanner.nextInt();

        Sic calculator = new Sic(principal, interest);

        BigDecimal totalValue = calculator.calculateTotalValue(noOfYears);
        System.out.println("Total value after " + noOfYears + " years: " + totalValue);

        BigDecimal interestValue = calculator.calculateInterest(noOfYears);
        System.out.println("Total interest earned after " + noOfYears + " years: " + interestValue);
    }
}
