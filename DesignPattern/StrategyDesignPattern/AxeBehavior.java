package StrategyDesignPattern;

// algorithm number two
public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("AXE weapon");
    }

}
