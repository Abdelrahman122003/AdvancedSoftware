package openClosedPrinciple.Sol_2_InterfaceClass;

public class Main {
    public static void main(String[] args) {
        // in this main we test interface class calcBouns ====> in this class we use function calcHourBonus 
        //  and must be implements in any class use this interface class 
        //  so we must implements this function  in manager and employee class
        calcBouns p = new Employee("20210205", "abdelrhman", 120000, "ُEmployee");
        calcBouns p2 = new Manager("2021020243", "mostafa", 120000, "ُManager");
        System.out.println("bouns : " + p.calcHourBouns(8));

        System.out.println("bouns : " + p2.calcHourBouns(8));
    }
}

