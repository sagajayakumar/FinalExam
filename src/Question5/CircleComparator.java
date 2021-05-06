/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

import java.util.Comparator;

/**
 *
 * @author Jaya Kumar Saga
 */
public class CircleComparator implements Comparator<ComparableCircle> {

    @Override
    public int compare(ComparableCircle c1, ComparableCircle c2) {
        if (c1.getArea() > c2.getArea()) {
            return 1;
        } else if (c1.getArea() > c2.getArea()) {
            return 0;
        } else {
            return -1;
        }
    }

}
