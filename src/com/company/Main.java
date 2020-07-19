package com.company;

public class Main {

    public static void main(String[] args) {
        Son son = (Son) createObjects("Son");
        Daughter daughter = (Daughter) createObjects("Daughter");
        Mother mother = (Mother) createObjects("Mother");
        son.print();
        daughter.print();
        mother.print();
    }
    public static Father createObjects(String className){
        Father father = new Father(39,"BMW");
        switch (className) {
            case "Daughter" -> {
                father = new Daughter(17,"Ariana",1 );
                father.setYears(17);
                father.setString("Ariana");
            }
            case "Son" -> {
                father = new Son(3,"Mercedes","BMW");
                father.setYears(3);
                father.setString("John");
            }
            case "Mother" -> {
                father = new Mother(35,"Lexus","Lagman");
                father.setYears(35);
                father.setString("Mariya");
            }
        }
        return father;
    }
}
