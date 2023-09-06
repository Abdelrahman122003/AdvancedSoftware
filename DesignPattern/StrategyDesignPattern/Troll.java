package StrategyDesignPattern;

// character number three
public class Troll extends Character{

     @Override
    public void fight() {
        WeaponBehavior weap = new BomAndArrowBehavior();
        weap.useWeapon();
    }
}
