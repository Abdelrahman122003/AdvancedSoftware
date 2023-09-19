public class CeilingFanOffCommand implements Command{
    private CeilingFan ceilF;
    private int prevSpeed;
    public CeilingFanOffCommand(CeilingFan cF){
        this.ceilF = cF;
    }
    @Override
    public void execute(){
        prevSpeed = ceilF.getSpeed();
        this.ceilF.off();
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