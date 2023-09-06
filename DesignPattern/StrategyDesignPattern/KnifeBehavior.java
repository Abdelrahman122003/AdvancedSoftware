package StrategyDesignPattern;

// algorithm number one
public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("knife weapon");
    }
    
}
