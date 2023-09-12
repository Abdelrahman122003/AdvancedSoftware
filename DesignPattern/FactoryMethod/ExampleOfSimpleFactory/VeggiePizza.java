package FactoryMethod.ExampleOfSimpleFactory;

public class VeggiePizza extends Pizza {

    @Override
    public void prepare(){
        System.out.println("preparing veggiePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking veggiePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting veggiePizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing veggiePizza");
    }
    
}
