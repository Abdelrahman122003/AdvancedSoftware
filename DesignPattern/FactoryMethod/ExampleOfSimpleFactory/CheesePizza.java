package FactoryMethod.ExampleOfSimpleFactory;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("preparing CheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking CheesePizza");
    }

    @Override
    public void cut() 
    {
        System.out.println("Cutting CheesePizza");
    }

    @Override
    public void box() {
       System.out.println("Boxing CheesePizza");
    }
    
}
