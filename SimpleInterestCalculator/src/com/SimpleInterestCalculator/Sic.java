package com.SimpleInterestCalculator;

import java.math.BigDecimal;

public class Sic{

    BigDecimal principal;
    BigDecimal interest;

    public Sic(BigDecimal principal, BigDecimal interest) {
        this.principal = principal;
        this.interest = interest.divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int noOfYears) {
        BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
        BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(noOfYearsBigDecimal));
        return totalValue;
    }

    public BigDecimal calculateInterest(int noOfYears) {
        BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
        BigDecimal interestValue = principal.multiply(interest).multiply(noOfYearsBigDecimal);
        return interestValue;
    }
}
