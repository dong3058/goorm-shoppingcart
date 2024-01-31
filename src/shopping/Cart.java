package shopping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {


    public static HashMap<Item,Integer> shoppingcart = new HashMap<>();

    public Cart(){}

    public void additems(String key, Integer num, Set<Item> list){
        if(shoppingcart.keySet().size()==0){
            for(Item i:list){
                if(i.getKey().equals(key)){
                    shoppingcart.put(i,num);
                }
            }
        }
        else{
            for(Item i:list){
                if(i.getKey().equals(key)){
                    if (shoppingcart.get(i)==null){
                        shoppingcart.put(i,num);

                    }
                    else{
                    shoppingcart.put(i,shoppingcart.get(i)+num);}
                }
            }




        }
    }



    public void showitems(){
       /* Set<Map.Entry<Item,Integer>> x=shoppingcart.entrySet();

        for(Map.Entry<Item,Integer> m:x){
            System.out.printf("품목명:%s 가격:%d 갯수:%d %n",m.getKey().getName(),m.getKey().getPrice(),m.getValue());

        }*/
        shoppingcart.forEach((key,value)-> System.out.printf("품목명:%s 가격:%d 갯수:%d %n",key.getName(),key.getPrice(),value));



    }

     public void removeitems(String key,Integer number, Set<Item> list){

         if(shoppingcart.keySet().size()==0){
             System.out.println("장바구니에 물건이 없습니다");
         }
         else {
             for(Item i:list){
                 if(i.getKey().equals(key)) {
                     if (number >= shoppingcart.get(i)) {
                         shoppingcart.remove(i);
                         System.out.println("물건이 삭제되었습니다.");
                     } else {


                         shoppingcart.put(i, shoppingcart.get(i) - number);
                     }
                 }
             }



         }





     }



}