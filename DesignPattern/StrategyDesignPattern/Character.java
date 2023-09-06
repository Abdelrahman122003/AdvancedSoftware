package StrategyDesignPattern;

// why class abstract not interface?
// Ans : in interface we can not create objects or variables 
// but in abstract we can create objects and variables 
public abstract class Character {
    WeaponBehavior weapon;
     public abstract  void fight();
     public void setWeapon(WeaponBehavior weap) {
         this.weapon = weap;
     }
    
}
