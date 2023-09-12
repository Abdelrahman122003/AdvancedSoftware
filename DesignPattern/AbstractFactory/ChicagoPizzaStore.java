package AbstractFactory;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        switch (type) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Cheese Pizza");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Veggie Pizza");
            }
            case "clam" -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Clam Pizza");
            }
            case "pepperoni" -> {
                pizza = new PepproniPizza(ingredientFactory);
                pizza.setName("Chicago Pepperoni Pizza");
            }
        }
        return pizza;
    }
}
