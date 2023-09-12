package AbstractFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
          Veggies[] veggies = {new BlackOlives() , new EggPlant() , new Spinach()};
        return veggies;

    }

    @Override
    public Pepperoni createPepperoni() {
       return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
       return new FrozenClams();
    }
    
}
