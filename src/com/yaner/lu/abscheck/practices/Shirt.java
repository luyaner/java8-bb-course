package com.yaner.lu.abscheck.practices;

public class Shirt extends Frock{

    @Override
    public double calcArea(int size) {
        double constant = 1.3;
        return size * constant;
    }
}
