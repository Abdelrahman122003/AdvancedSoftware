package DependencyInversion;


// low level => DeliveryDriver and heigh level => DeliveryCompany these depend on DeliveryServices (abstraction)
public class DeliveryCompany
{
    private DeliveryServices deliverySer;

    public DeliveryCompany(DeliveryServices deliverySer){
        this.deliverySer = deliverySer;
    }

    public void sendProduct(Product p){
        this.deliverySer.deliveryProduct(p);
    }
}
