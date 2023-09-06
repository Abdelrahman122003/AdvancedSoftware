
public abstract class Beverage
{
    String Description = "Unknown Beverage";
    public String getDescription(){
        return Description;
    }
    public abstract float cost();
}