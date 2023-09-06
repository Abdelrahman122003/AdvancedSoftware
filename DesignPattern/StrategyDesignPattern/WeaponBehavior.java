package StrategyDesignPattern;

// This interface has many algorithms (Sword, knife, Axe and (Bow and Arrow));
// so in this interface has one function that is implemented by child classes 
// with more than one algorithm

//** Behavior 
// This Behavior Use By Character
public interface  WeaponBehavior {
    public void useWeapon();
}
