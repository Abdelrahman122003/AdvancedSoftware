package FactoryMethod.ExampleOfMethodFactory;

public class NYStyleVeggiePizza extends Pizza{
     public void NYStyleVeggiePizza(){}
    @Override
    public void prepare() {
       System.out.println("prepare ====> NYStyleVeggiePizza");
    }

    @Override
    public void bake() {
        System.out.println("bake ====> NYStyleVeggiePizza");
    }

    @Override
    public void cut() {
        System.out.println("cut ====> NYStyleVeggiePizza");
    }

    @Override
    public void box() {
        System.out.println("box ====> NYStyleVeggiePizza");
    }
}
