package FactoryMethod.ExampleOfSimpleFactory;
public class PizzaStore {
    PizzaFactoryMethod factory;
    public void PizzaStore(){
        factory = new PizzaFactoryMethod();
    }
    public void orderPizza(String type){
        Pizza p ;
        p = factory.createPizza(type);
        p.prepare();
        p.bake();
        p.cut();
        p.box();
    }
}
