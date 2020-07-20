package com.company;

public class Daughter extends Father implements Printable{
    private int grade;

    public Daughter(int years, String name, int grade) {
        super(years, name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public void print() {
        System.out.println("Учится в классе - " + getGrade());
        System.out.println("Лет - "+getYears());
        System.out.println("Имя - "+getName());

    }
}
