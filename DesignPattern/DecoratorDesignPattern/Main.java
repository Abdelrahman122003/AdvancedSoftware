public class Main {
    public static void main(String[] args){
        Beverage b = new Espresso();
        b = new Mocha(b);
        b = new Mocha(b);
        b = new Whip(b);
        b = new Milk(b);
        b = new Soy(b);
        b = new Soy(b);
        b = new Soy(b);
        System.out.println(b.getDescription() + "  : " + b.cost());
    }
}
