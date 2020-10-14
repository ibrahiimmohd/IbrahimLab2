/**
 * Full Name: Ibrahim Ali
 * Student ID: 301022172
 * Section: COMP 304 - 002
 * */

package ibrahim.ali.s301022172;

import java.io.Serializable;
import java.text.DecimalFormat;

public class HomeTypes implements Serializable {
    //Declare variables
    public String address;
    public double price;

    //Setting constructors
    public HomeTypes(){}

    public HomeTypes(String address, double price){
        this.address = address;
        this.price = price;
    }

    //Setting getters
    public String get_address() {
        return this.address;
    }

    public String get_price() {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        return formatter.format(this.price);
    }

    //Setting setters
    public void set_address(String address) {
        this.address = address;
    }

    public void set_price(int price) {
        this.price = price;
    }
}
