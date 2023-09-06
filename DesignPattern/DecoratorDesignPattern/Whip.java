public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage b) {
        Description = ", Whip";
        this.beverage = b;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + Description;
    }

    @Override
    public float cost() {
        return 3.56f + beverage.cost();
    }
}
