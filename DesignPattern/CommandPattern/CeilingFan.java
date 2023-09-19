public class CeilingFan{
    String location;
    public static final int HIGH = 3 , MEDIUM = 2 , LOW = 1 , OFF = 0;
    private int speed;
    public CeilingFan(String loc){
        this.location = loc;
        speed = OFF;
        System.out.println("Location is : " + location);
    }
    public void high(){
        speed = HIGH;
    }
    public void medium(){
        speed = MEDIUM;
    }
    public void low(){
        speed = LOW;
    }
    public void off(){
        speed = OFF;
    }
    public int getSpeed(){return speed;}
} 