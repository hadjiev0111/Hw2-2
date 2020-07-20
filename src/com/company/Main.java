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
        Father object = new Father(39,"Michael");
        switch (className) {
            case "Son" -> {
                object = new Son(3,"John", "Machine");
            }
            case "Daughter" -> {
                object = new Daughter(17,"Ariana",11 );
            }
            case "Mother" -> {
                object = new Mother(35,"Mariya","Pizza");
            }
        }
        return object;
    }
}
