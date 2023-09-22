public class Tea extends CaffeineBeverage{

    @Override
    void brew() {
       System.out.println("Dripping Tea through filter");
    }

    @Override
    void addCondiments() {
      System.out.println("Adding Lemon");
    }

}