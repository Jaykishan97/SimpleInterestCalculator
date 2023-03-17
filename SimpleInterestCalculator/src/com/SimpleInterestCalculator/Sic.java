package com.SimpleInterestCalculator;

import java.math.BigDecimal;

public class Sic {

    private BigDecimal principal;
    private BigDecimal interest;
    private int years;
    private int compoundFreq;

    public Sic(BigDecimal principal, BigDecimal interest, int years, int compoundFreq) {
        this.principal = principal;
        this.interest = interest;
        this.years = years;
        this.compoundFreq = compoundFreq;
    }

    public BigDecimal calculateTotalValue() {
        BigDecimal totalValue = principal.multiply(
                BigDecimal.ONE.add(interest.divide(BigDecimal.valueOf(compoundFreq), 10, BigDecimal.ROUND_HALF_UP))
                        .pow(compoundFreq * years));
        return totalValue.setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
