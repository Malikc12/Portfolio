package com.assets;

import com.pluralsight.finance.FixedAsset;

public class Gold extends FixedAsset {

    private double weight;

    public Gold(double marketValue, String name, double weight) {
        super(marketValue, name);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return getMarketValue();
    }
}
