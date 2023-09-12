package FactoryMethod.ExampleOfMethodFactory;

public class ChicagoStylePepperoniPizza extends Pizza {
    @Override
    public void prepare() {
       System.out.println("prepare ====> ChicagoStylePepperoniPizza");
    }

    @Override
    public void bake() {
       System.out.println("bake ====> ChicagoStylePepperoniPizza");
    }

    @Override
    public void cut() {
       System.out.println("cut ====> ChicagoStylePepperoniPizza");
    }

    @Override
    public void box() {
      System.out.println("box ====> ChicagoStylePepperoniPizza");
    }
    
}
