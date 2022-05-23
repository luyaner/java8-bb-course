package com.yaner.lu.oo.importpackage;

import com.yaner.lu.oo.importpackage.subclass.Student;
import com.yaner.lu.oo.importpackage.subclass.Teacher;
import com.yaner.lu.oo.importpackage.superclass.Person;

public class TestPackage {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Teacher teacher = new Teacher();
        System.out.println("My first application.");
    }
}
