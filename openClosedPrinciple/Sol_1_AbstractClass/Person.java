package openClosedPrinciple.Sol_1_AbstractClass;

public abstract class Person {
    public String ID;
    public String name;
    public double basicSalary;
    public String personType;
    
    public String getName() {return name;}
    public String getPersonType() {return personType;}
    public String getPersonID() {return ID;}
    public double getBasicSalary() {return basicSalary;}
    // **problem
    // here is when we need to add calcHourBouns for manager in this moment 
    // we need to modify in this class this violate osp(open close principle)
    
    // public double calc Hour Bouns(double hours) {
    //     return ((basicSalary/30)/8)*hours;
    // }

    //** to achieve OSP

    // first : class person become abstract or interface class ==> person ---> abstract
    // second : function calcHourBouns we convert it to abstract function
    // third : we add varible string personType(employee , manager , ......)
    // fourth : we add class manager and employee
    public abstract double calcHourBouns(int hours);
} 