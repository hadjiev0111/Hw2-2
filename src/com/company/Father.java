package com.company;

public class Father {
    private int years;
    private String name;

    public Father(int years, String machine) {
        this.years = years;
        this.name = machine;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getString() {
        return name;
    }

    public void setString(String name) {
        this.name = name;
    }
}
