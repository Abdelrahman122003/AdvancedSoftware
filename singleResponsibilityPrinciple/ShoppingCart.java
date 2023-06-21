package singleResponsibilityPrinciple;
import java.util.ArrayList;

public class ShoppingCart {
    public static ArrayList<Items> cart = new ArrayList<>();
    
    public void removeFromCart(Items item) 
    {
        if(cart.contains(item))
        {
            cart.remove(item);
        }
    }
    public Boolean add(Items item){
        //**problem 
        // this quantityItem return the quantity of this item -> these lines violate SRP
        // int quantityItem = -1;
        // for(int i = 0; i < Stock.items.size(); i++){
        //     if(Stock.items.get(i).code == item.code){
        //         quantityItem = Stock.items.get(i).amount;
        //         break;
        //     }
        // }
        //** to achive SRP 
        // -> first add function =>getQuantityForItem()
        //  -> second add function => availableAmount() to check quantity that ordered
        if(Stock.availableAmount(item)){
            cart.add(item);
            return true;
        }
        return false;
    }
    //** problem
    //  and this method not specify ShoppingCart
    
    // public int getItemsCount(){
        //     return Stock.items.size();
        // }

    //** to achive SRP 
    // so we take this method to class stock 


    // **this method violate SRP => single responsibility principle
    
    // public void createInvoice(){
    //     calc total price 
        
    //     get customer data
    //     save to database
    //     print invoice
    //     sent invoive to customer email
    // }
    //** to achive SRP
    // first => we create new class specify sales invoice
    // second => we create new class to send sales invoice
    // third => we create new class for calc price

}