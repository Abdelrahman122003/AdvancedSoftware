package FactoryMethod.ExampleOfMethodFactory;

public class NYStyleClamPizza extends Pizza{
    public void NYStyleClamPizza(){}
    @Override
    public void prepare() {
       System.out.println("prepare ====> NYStyleClamPizza");
    }

    @Override
    public void bake() {
        System.out.println("bake ====> NYStyleClamPizza");
    }

    @Override
    public void cut() {
        System.out.println("cut ====> NYStyleClamPizza");
    }

    @Override
    public void box() {
        System.out.println("box ====> NYStyleClamPizza");
    }
}
