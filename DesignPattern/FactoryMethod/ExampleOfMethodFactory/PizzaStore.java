package FactoryMethod.ExampleOfMethodFactory;
public abstract class PizzaStore{
    protected abstract Pizza createPizza(String type);
    public void orderPizza(String type){
       Pizza p = createPizza(type);
       p.prepare();
       p.bake();
       p.cut();
       p.box();
    }
}