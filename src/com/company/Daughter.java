package com.company;

public class Daughter extends Father implements Printable{
    private int numbers;

    public Daughter(int years, String string, int numbers) {
        super(years, string);
        this.numbers = numbers;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    @Override
    public void print() {
        System.out.println("Число - " +getNumbers());
        System.out.println("Лет - "+getYears());
        System.out.println("Имя - "+getString());

    }
}
