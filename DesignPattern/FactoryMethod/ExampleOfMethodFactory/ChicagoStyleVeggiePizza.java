package FactoryMethod.ExampleOfMethodFactory;

public class ChicagoStyleVeggiePizza extends Pizza {

        @Override
    public void prepare() {
       System.out.println("prepare ====> ChicagoStyleVeggiePizza");
    }

    @Override
    public void bake() {
       System.out.println("bake ====> ChicagoStyleVeggiePizza");
    }

    @Override
    public void cut() {
       System.out.println("cut ====> ChicagoStyleVeggiePizza");
    }

    @Override
    public void box() {
      System.out.println("box ====> ChicagoStyleVeggiePizza");
    }
    
}
