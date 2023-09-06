package StrategyDesignPattern;

// character number four
public class Knight extends Character{
      @Override
    public void fight() {
        WeaponBehavior weap = new SwordBehavior();
        weap.useWeapon();
    }
}
