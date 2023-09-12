package AbstractFactory;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        switch (type) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Cheese Pizza");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Veggie Pizza");
            }
            case "clam" -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Clam Pizza");
            }
            case "pepperoni" -> {
                pizza = new PepproniPizza(ingredientFactory);
                pizza.setName("New York Pepperoni Pizza");
            }
        }
        return pizza;
    }
    
}
