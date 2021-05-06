/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author Jaya Kumar Saga
 */
public class privateUniversity extends University implements Inperson {

    public String Owner;

    public privateUniversity(String Owner, String name, int departments) {
        super(name, departments);
        this.Owner = Owner;
    }

    @Override
    public String toString() {
        return super.toString() + " Owner=" + Owner;
    }

    /**
     *
     * @return 201
     */
    @Override
    public String getRoom() {
        return "201";
    }

}
