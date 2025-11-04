package com.pluralsight.finance;

public class Jewelry extends FixedAsset{

    private double karat;

    public Jewelry(double marketValue, String name, double karat) {
        super(marketValue, name);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return getMarketValue();
    }
}
