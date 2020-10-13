package ibrahim.ali.s301022172;

import java.io.Serializable;
import java.text.DecimalFormat;

public class HomeTypes implements Serializable {
    public String address;
    public double price;

    public HomeTypes(){

    }

    public HomeTypes(String address, double price){
        this.address = address;
        this.price = price;
    }

    public String get_address() {
        return this.address;
    }

    public void set_address(String address) {
        this.address = address;
    }

    public String get_price() {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        return formatter.format(this.price);
    }

    public void set_price(int price) {
        this.price = price;
    }
}
