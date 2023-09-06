package StrategyDesignPattern;

// character number two
public class Queen extends Character{

    @Override
    public void fight() {
        WeaponBehavior weap = new AxeBehavior();
        weap.useWeapon();
    }
    
}
