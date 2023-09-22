public class Main {
    public static void main(String[] args){
        CaffeineBeverage t = new Tea();
        t.prepare();
        CaffeineBeverage cof = new CoffeeWithHook();
        cof.prepare();
    }
}
