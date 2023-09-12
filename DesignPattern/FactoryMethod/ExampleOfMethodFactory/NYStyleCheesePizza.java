package FactoryMethod.ExampleOfMethodFactory;

public class NYStyleCheesePizza extends Pizza {
     public void NYStyleCheesePizza(){}
    @Override
    public void prepare() {
       System.out.println("prepare ====> NYStyleCheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("bake ====> NYStyleCheesePizza");
    }

    @Override
    public void cut() {
        System.out.println("cut ====> NYStyleCheesePizza");
    }

    @Override
    public void box() {
        System.out.println("box ====> NYStyleCheesePizza");
    }
}
