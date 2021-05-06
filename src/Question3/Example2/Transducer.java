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
public class Transducer {

    private String manufacturer;
    private int year;

    public Transducer(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
    }

    @Override
    public String toString() {
        return "manufacturer=" + manufacturer + ", year=" + year ;
    }

}
