package com.yaner.lu.variable;

public class VarDataTypeTrans {
    public static void main(String[] args) {
        double var1 = 111.1D;
        double var2 = 222.2D;
        var2 = var1/var2;
        String str = "result: ";
        System.out.println(str + var2);
    }
}
