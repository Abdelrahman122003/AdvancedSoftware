package DesignPattern.IteratorPattern;

public class Main {
    public static void main(String[] args){

        Menu dinerM = new DinerMenu();
        Waitress w = new Waitress(dinerM);
        w.printMenu();
    }
}
