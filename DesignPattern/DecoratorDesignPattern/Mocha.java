
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage b) {
        Description = ", Mocha";
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
