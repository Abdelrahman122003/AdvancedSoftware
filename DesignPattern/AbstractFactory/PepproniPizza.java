package AbstractFactory;

public class PepproniPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;
     public PepproniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("“Preparing “" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        }
    
}
