package FactoryMethod.ExampleOfSimpleFactory;
public class PizzaFactoryMethod {
    public void PizzaFactoryMethod(){}
    public Pizza createPizza(String t){
        Pizza p = null;
        if(t.equals("cheese")){
            p = new CheesePizza();
        }else if(t.equals("clam")){
            p = new ClamPizza();
        }else if(t.equals("Veggie")){
            p  = new VeggiePizza();
        }else if(t.equals("pepperoni")){
            p = new PepperoniPizza();
        }
        return p;
    }
}
