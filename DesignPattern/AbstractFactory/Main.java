package AbstractFactory;

public class Main {
    public static void main(String[] args){
        PizzaStore p = new ChicagoPizzaStore();
        p.orderPizza("clam");

    }
}
