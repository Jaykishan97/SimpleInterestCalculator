package com.SimpleInterestCalculator;

import java.math.BigDecimal;
import java.util.Scanner;

public class SicRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for principal, interest rate, number of years, and compounding frequency
        System.out.println("Enter the principal amount:");
        BigDecimal principal = scanner.nextBigDecimal();

        System.out.println("Enter the interest rate (as a percentage):");
        BigDecimal interest = scanner.nextBigDecimal().divide(BigDecimal.valueOf(100), 5, BigDecimal.ROUND_HALF_UP);

        System.out.println("Enter the number of years:");
        int years = scanner.nextInt();

        System.out.println("Enter the compounding frequency (1 for annually, 2 for semi-annually, 12 for monthly, etc.):");
        int compoundFreq = scanner.nextInt();

        // Validate user input
        if (principal.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Error: Principal amount must be greater than zero.");
            return;
        }
        if (interest.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Error: Interest rate must be greater than zero.");
            return;
        }
        if (years <= 0) {
            System.out.println("Error: Number of years must be greater than zero.");
            return;
        }
        if (compoundFreq <= 0) {
            System.out.println("Error: Compounding frequency must be greater than zero.");
            return;
        }

        Sic calculator = new Sic(principal, interest, years, compoundFreq);
        BigDecimal totalValue = calculator.calculateTotalValue();

        System.out.println("Total value: " + totalValue);
    }

}
