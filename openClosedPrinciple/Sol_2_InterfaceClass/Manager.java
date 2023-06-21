package openClosedPrinciple.Sol_2_InterfaceClass;

public class Manager extends Person implements calcBouns{
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
