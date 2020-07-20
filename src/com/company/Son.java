package com.company;

public class Son extends Father implements Printable{
    private String toy;

    public Son(int years, String name, String toy) {
        super(years, name);
        this.toy = toy;
    }

    public String getToy() {
        return toy;
    }

    @Override
    public void print() {
        System.out.println("Любимая игрушка - " + getToy());
        System.out.println("Лет - "+getYears());
        System.out.println("Имя - "+getName());
    }
}
