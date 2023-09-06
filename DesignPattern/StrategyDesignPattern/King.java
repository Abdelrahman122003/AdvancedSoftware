package StrategyDesignPattern;

// character number one
public class King extends Character {

    @Override
    public void fight() {
        WeaponBehavior weap = new KnifeBehavior();
        weap.useWeapon();
    }
    
}
