package DependencyInversion;

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
