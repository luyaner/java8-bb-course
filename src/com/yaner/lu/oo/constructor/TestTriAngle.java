package com.yaner.lu.oo.constructor;

public class TestTriAngle {
    public static void main(String[] args) {
        TriAngle triAngle = new TriAngle(1.1, 2.2);
        double area = triAngle.getHeight() * triAngle.getBase() / 2;
        System.out.println(area);
    }
}

class TriAngle {
    private double base;
    private double height;

    public TriAngle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public TriAngle() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
