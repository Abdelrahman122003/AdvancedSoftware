package StrategyDesignPattern;

public class Main {

    public static void main(String[] args){
        Character c = new King();
        c.fight();

        Character c1 = new Queen();
        c1.fight();

        Character c2 = new Troll();
        c2.fight();

        Character c3 = new Knight();
        c3.fight();
    }
    
}
