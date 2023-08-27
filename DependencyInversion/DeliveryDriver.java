package DependencyInversion;


// **DeliveryDriver --> heigh level depend on low level(deliveryProduct)

// public class DeliveryDriver {

//     public void deliveryProduct(Product p){}
// }

// **so this violate DIP

// **solve problem with create interface DeliveryServices and implement it in DeliveryDriver
public class DeliveryDriver implements DeliveryServices {

    public void deliveryProduct(Product p){}
}
