package FactoryMethod.ExampleOfMethodFactory;

public class ChicagoStyleClamPizza extends Pizza {

   
    @Override
    public void prepare() {
       System.out.println("prepare ====> ChicagoStyleClamPizza");
    }

    @Override
    public void bake() {
       System.out.println("bake ====> ChicagoStyleClamPizza");
    }

    @Override
    public void cut() {
       System.out.println("cut ====> ChicagoStyleClamPizza");
    }

    @Override
    public void box() {
      System.out.println("box ====> ChicagoStyleClamPizza");
    }
    
    
}
