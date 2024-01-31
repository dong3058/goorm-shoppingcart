package shopping;

import java.util.Objects;

public class Item {


    private String key;
    private  String name;


    private Integer price;


    public Item(String key,String name,Integer price){
        this.name=name;
        this.price=price;
        this.key=key;

    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setPrice(Integer price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object o){

        if(this.name.length()==((String)o).length()){
            char [] v1=this.name.toCharArray();
            char [] v2=((String)o).toCharArray();
            for(int i=0;i<this.name.length();i++){
                if (v1[i]==v2[i]){
                    continue;
                }
                else{

                    return false;
                }

            }
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public int hashCode(){

        return Objects.hash(this.name);
    }


}
