package com.pluralsight.finance;

public abstract class FixedAsset {

    private String name;
    private double marketValue;

    public FixedAsset(double marketValue, String name) {
        this.marketValue = marketValue;
        this.name = name;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public String getName() {
        return name;
    }

   public abstract double getValue();
}
