package interfaceSegregation;

public interface paidParkingLot extends parkingLot
{
    public double calcFeeCar();//Returns the price based on the number of hours
    public void doPayment(Car c);
}