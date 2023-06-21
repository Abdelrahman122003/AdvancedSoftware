package openClosedPrinciple.Sol_1_AbstractClass;

public class Main {
    public static void main(String[] args) {
        // in this main we test abstract class Person ====> in this class we use function calcHourBonus 
        //  and override it int manger and employee
        Person p = new Employee("20210205", "abdelrhman", 120000, "ُEmployee");
        Person p2 = new Manager("2021020243", "mostafa", 120000, "ُManager");


        
        System.out.println("bouns : " + p.calcHourBouns(8));

        System.out.println("bouns : " + p2.calcHourBouns(8));
    }
    
}