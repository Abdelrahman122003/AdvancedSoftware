
public class LightOffCommand implements Command{
    private Light light;
    public LightOffCommand(Light l){
        this.light = l;
    }
    @Override
    public void execute(){
        this.light.off();
        
        System.out.println("Execute : Light Off");
    }
    @Override
    public void undo(){
        this.light.on();
        
        System.out.println("Execute : Light On");
    }
}