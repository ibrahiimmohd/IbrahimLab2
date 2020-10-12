package ibrahim.ali.s301022172;

import java.io.Serializable;

public class HomeTypes implements Serializable {
    public String address;
    public int price;
    //public int price;  image

    public HomeTypes(){

    }

    public HomeTypes(String address, int price){
        this.address = address;
        this.price = price;
    }

    public String get_address() {
        return this.address;
    }

    public void set_address(String address) {
        this.address = address;
    }

    public int get_price() {
        return this.price;
    }

    public void set_price(int price) {
        this.price = price;
    }
}
