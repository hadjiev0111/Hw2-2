package com.company;

public class Mother extends Father implements Printable{
    private String food;

    public Mother(int years, String machine, String food) {
        super(years, machine);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public void print() {
        System.out.println("Любимая еда - "+getFood());
        System.out.println("Лет - "+getYears());
        System.out.println("Имя - "+getString());

    }
}
