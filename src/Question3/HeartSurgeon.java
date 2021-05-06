/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Jaya Kumar Saga
 */
public class HeartSurgeon extends Doctor {

    private String name;

    public HeartSurgeon(String name, long id) {
        super(id);
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + " name=" + name;
    }

}
