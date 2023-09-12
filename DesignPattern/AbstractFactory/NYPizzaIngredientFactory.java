package AbstractFactory;
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
       return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
       Veggies [] vv = {new Garlic(), new Mushroom(), new Onion(), new RedPapper()};
       return vv;
    }

    @Override
    public Pepperoni createPepperoni() {
       return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
    
}
