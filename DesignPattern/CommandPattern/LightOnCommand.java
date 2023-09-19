public class LightOnCommand implements Command{
    private Light light;
    public LightOnCommand(Light l){
        this.light = l;
    }
    @Override
    public void execute(){
        System.out.println("Execute : Light On");
        this.light.on();
    }
    @Override
    public void undo(){
         System.out.println("undo : Light Off");
        this.light.off();
    }
}