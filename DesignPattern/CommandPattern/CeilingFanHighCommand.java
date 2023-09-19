public class CeilingFanHighCommand implements Command{
    private CeilingFan ceilF;
    private int prevSpeed;
    @Override
    public void execute(){
        prevSpeed = ceilF.getSpeed();
        this.ceilF.high();
    }
    @Override
    public void undo()
    {
        if (prevSpeed == ceilF.HIGH) {
            ceilF.high();
        }else if (prevSpeed == ceilF.MEDIUM) {
            ceilF.medium();
        }else if (prevSpeed == ceilF.LOW) {
            ceilF.low();
        }else if (prevSpeed == ceilF.OFF) {
            ceilF.off();
        }
    }
}