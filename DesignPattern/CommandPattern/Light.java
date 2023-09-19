public class Light{
    private boolean on;
    private String location;
    public Light(String loc){
        location = loc;
        System.out.println("Location is : " + location);
    }
    public void on() {
        on = true;
    }
    public void off() {
        on = false;
    }
}