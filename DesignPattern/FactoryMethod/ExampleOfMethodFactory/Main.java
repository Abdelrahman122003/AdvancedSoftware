package FactoryMethod.ExampleOfMethodFactory;

public class Main {
    public static void main(String[] args){
        PizzaStore pp = new ChicagoStyleStore();
        pp.orderPizza("clam");
    }
}
