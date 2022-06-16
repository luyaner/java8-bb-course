package com.yaner.lu.abscheck;

public class TemplateDesign {
    public static void main(String[] args) {
        SubTemplateOne subTemplateOne = new SubTemplateOne();
        subTemplateOne.getTimeSpent();

        SubTemplateTwo subTemplateTwo = new SubTemplateTwo();
        subTemplateTwo.getTimeSpent();
    }
}

abstract class Template {

    public void getTimeSpent() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("Time cost: " + (end - start));
    }

    abstract void code();
}

class SubTemplateOne extends Template {

    @Override
    void code() {
        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

class SubTemplateTwo extends Template {

    @Override
    void code() {
        for (int i = 0; i < 1000; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}