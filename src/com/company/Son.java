package com.company;

public class Son extends Father implements Printable{
    private String machine;

    public Son(int years, String machine, String machine1) {
        super(years, machine);
        this.machine = machine1;
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    @Override
    public void print() {
        System.out.println("Марка машины - " + getMachine());
        System.out.println("Лет - "+getYears());
        System.out.println("Имя - "+getString());
    }
}
