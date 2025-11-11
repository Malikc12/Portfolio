package com.assets;

import com.pluralsight.finance.FixedAsset;

public class House extends FixedAsset {
    private  int yearBuilt;
    private int squareFeet;
    private int bedRooms;

    public House(double marketValue, String name, int squareFeet, int bedRooms) {
        super(marketValue, name);
        this.squareFeet = squareFeet;
        this.bedRooms = bedRooms;
    }

    @Override
    public double getValue() {
        return getMarketValue();
    }
}
