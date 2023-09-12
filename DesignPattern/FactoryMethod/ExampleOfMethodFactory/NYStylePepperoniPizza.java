package FactoryMethod.ExampleOfMethodFactory;

public class NYStylePepperoniPizza extends Pizza{
    public void NYStylePepperoniPizza(){}
    @Override
    public void prepare() {
       System.out.println("prepare ====> NYStylePepperoniPizza");
    }

    @Override
    public void bake() {
        System.out.println("bake ====> NYStylePepperoniPizza");
    }

    @Override
    public void cut() {
        System.out.println("cut ====> NYStylePepperoniPizza");
    }

    @Override
    public void box() {
        System.out.println("box ====> NYStylePepperoniPizza");
    }
}
