import shopping.Cart;
import shopping.Item;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Item> list=new HashSet<>();

        additem(new Item("사과","사과",1000),"사과",list);
        additem(new Item("배","배",2000),"배",list);
        additem(new Item("배","배",1000),"배",list);
        for(Item x:list){
            System.out.printf("품목:%s 가격:%d %n",x.getName(),x.getPrice());
        }


        Cart cart=new Cart();
        cart.additems("배",3,list);
        cart.additems("사과",3,list);
        cart.removeitems("사과",2,list);
        cart.showitems();



    }
    static void additem(Item item,String key,Set<Item> list){
        if (list.size()==0){
            list.add(item);
        }
        else{

            for(Item x:list){

                if (x.equals(key)){
                    return ;

                }
            }
            list.add(item);

        }
    }


}
