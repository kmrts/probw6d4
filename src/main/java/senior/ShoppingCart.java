package senior;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    /*
    A ShoppingCart osztályba dolgozz! Legyen egy addItem(String name, int quantity) metódusa,
    mellyel új bevásárlólista tételt lehet felvenni (termék neve és mennyisége).
    Az adatokat egy Item listába tárolja.
    Amennyiben már benne van az adott termék, ne újonnan vegye fel, hanem adja hozzá a mennyiséget a már felvett tételhez!
    Lehessen visszakérdezni név alapján a felvett mennyiséget a getItem(String name): int metódussal.
    Ha nem szerepel benne, 0 értéket adjon vissza!

    15,37
     */
    private List<Item> itemList= new ArrayList<>();

    public void addItem(String name, int quantity){
        Item newItem= new Item(name, quantity);

        if(itemList.contains(newItem)){
            int ind= itemList.indexOf(newItem);
            Item actu= itemList.get(ind);
            itemList.set(ind, new Item(actu.getName(), actu.getQuantity()+ quantity));
        }else{
            itemList.add(newItem);
        }

    }
    public int getItem(String name){
        for(Item i: itemList){
            if(name.equals( i.getName() )){
                return i.getQuantity();
            }
        }
        return 0;
    }
}
