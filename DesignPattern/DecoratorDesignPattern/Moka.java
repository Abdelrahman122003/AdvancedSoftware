
public class Moka extends CondimentDecorator{
    Beverage beverage;

    public Moka(Beverage b) {
        Description = ", Moka";
        this.beverage = b;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + Description;
    }

    @Override
    public float cost() {
        return 0.99f + beverage.cost();
    }
    
}
