package AbstractFactory;
public class ClamPizza extends Pizza {
    public PizzaIngredientFactory ingredientFactory;
    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
    }
    public void prepare() {
    System.out.println("“Preparing “" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
