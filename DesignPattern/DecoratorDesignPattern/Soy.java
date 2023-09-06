public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage b) {
        Description = ", Soy";
        this.beverage = b;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + Description;
    }

    @Override
    public float cost() {
        return 1.89f + beverage.cost();
    }
}
