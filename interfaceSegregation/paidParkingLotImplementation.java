package interfaceSegregation;

public class paidParkingLotImplementation implements paidParkingLot {

    public paidParkingLotImplementation(){}
    @Override
    public double calcFeeCar() {
        System.out.println("calcFeeCar");
        return 0;
    }

    @Override
    public void doPayment(Car c) {
        System.out.println("doPayment");
        
    }

    @Override
    public int getCap() {
        System.out.println("getCap");
        return 0;
    }

    @Override
    public void parkCar() {
        System.out.println("parkCar");
    }

    @Override
    public void unparkCar() {
        System.out.println("unparkCar");
    }
}
