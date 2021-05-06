/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3.Example2;

/**
 *
 * @author Jaya Kumar Saga
 */
public class Fan extends Transducer {

    private String price;

    public Fan(String price, String manufacturer, int year) {
        super(manufacturer, year);
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + ", price=" + price;
    }

}
