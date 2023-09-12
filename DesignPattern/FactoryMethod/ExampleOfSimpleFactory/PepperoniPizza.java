package FactoryMethod.ExampleOfSimpleFactory;

public class PepperoniPizza extends Pizza {

    @Override
    public void prepare() {
       System.out.println("preparing PepperoniPizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking PepperoniPizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting PepperoniPizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing PepperoniPizza");
    }
    
}
