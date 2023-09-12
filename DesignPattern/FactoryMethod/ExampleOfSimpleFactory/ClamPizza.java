package FactoryMethod.ExampleOfSimpleFactory;

public class ClamPizza extends  Pizza {

    @Override
    public void prepare() {
       System.out.println("preparing ClamPizza");
    }

    @Override
    public void bake() {
       System.out.println("Baking ClamPizza");
    }

    @Override
    public void cut() {
       System.out.println("Cutting ClamPizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing ClamPizza");
    }
    
}
