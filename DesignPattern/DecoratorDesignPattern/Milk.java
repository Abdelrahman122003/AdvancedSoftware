public class Milk extends CondimentDecorator{
    Beverage beverage;
    public Milk(Beverage b) {
        Description = ", Milk";
        this.beverage = b;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + Description;
    }

    @Override
    public float cost() {
        return 0.97f + beverage.cost();
    }
}
