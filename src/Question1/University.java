/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author jaya Kumar Saga
 */
public abstract class University {

    private String name;
    private int departments;

    public University(String name, int departments) {
        this.name = name;
        this.departments = departments;
    }

    public abstract String getRoom();

    @Override
    public String toString() {
        return " name=" + name + ", departments=" + departments;
    }
}
