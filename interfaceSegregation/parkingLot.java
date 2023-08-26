package interfaceSegregation;

// **this interface have 5 methods 
// **question ??? 
// **is each subclass implement all this methods???
// **answer : no
// **all subclasses implement parkCar, unparkCar and getCap but not all cars will pay fee
// super class
public interface parkingLot {
    public void parkCar();//decrease empty spot by 1

    public void unparkCar();//increase empty spot by 1

    public int getCap();// return car capacity  
     
    // **so we create new interface that implements calcFeeCar and doPayment
    // public double calcFeeCar();//Returns the price based on the number of hours

    // public void doPayment(Car c);
}
