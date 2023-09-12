package FactoryMethod.ExampleOfMethodFactory;

public class ChicagoStyleCheesePizza extends Pizza {

    @Override
    public void prepare() {
       System.out.println("prepare ====> ChicagoStyleCheesePizza");
    }

    @Override
    public void bake() {
       System.out.println("bake ====> ChicagoStyleCheesePizza");
    }

    @Override
    public void cut() {
       System.out.println("cut ====> ChicagoStyleCheesePizza");
    }

    @Override
    public void box() {
      System.out.println("box ====> ChicagoStyleCheesePizza");
    }
    
}
