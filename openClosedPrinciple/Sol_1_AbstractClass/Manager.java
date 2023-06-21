package openClosedPrinciple.Sol_1_AbstractClass;

public class Manager extends Person {
    @Override
    public double calcHourBouns(int hours){
        return((((basicSalary/ 30)/8)*hours)*2);
    }
    public Manager(String I, String n, double basicS, String personTy) {
    ID = I;
    name = n;
    basicSalary = basicS;
    personType = personTy;
    }
}