package com.company;

public class Mother extends Father implements Printable{
    private String likeFood;

    public Mother(int years, String name, String likeFood) {
        super(years, name);
        this.likeFood = likeFood;
    }

    public String getLikeFood() {
        return likeFood;
    }

    @Override
    public void print() {
        System.out.println("Любимая еда - "+getLikeFood());
        System.out.println("Лет - "+getYears());
        System.out.println("Имя - "+getName());

    }
}
