package singleResponsibilityPrinciple;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    public static List<Items> items = new ArrayList<>();

    static {
        items.add(new Items(10, "1234", 10));
        items.add(new Items(1000, "123434344", 1000000));
        items.add(new Items(15, "100234", 100));
    }
    public static int getQuantityForItem(Items item) {
        int quantityItem = -1;
        for(int i = 0; i < Stock.items.size(); i++){
            if(Stock.items.get(i).code == item.code){
                quantityItem = Stock.items.get(i).amount;
                // return true;
                break;
            }
        }
        return quantityItem;
    }
    public static boolean availableAmount(Items item) 
    {
        if(getQuantityForItem(item) == -1 || getQuantityForItem(item) < item.amount){
            return false;
        }
        return true;
    }
    public int getItemsCount(){
        return Stock.items.size();
    }
}
    